package com.tomkasp.api;

import com.tomkasp.entities.QuartzJobDetails;
import com.tomkasp.entities.QuartzJobDetailsId;
import com.tomkasp.repository.QuartzJobDetailsRepository;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quartz/jobs")
public class JobsApi {

    static final Logger LOG = LoggerFactory.getLogger(JobsApi.class);

    private final QuartzJobDetailsRepository quartzJobDetailsRepository;

    @Autowired
    public JobsApi(QuartzJobDetailsRepository quartzJobDetailsRepository) {
        this.quartzJobDetailsRepository = quartzJobDetailsRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<QuartzJobDetails> getAllQuartzJobDetails() {
        return quartzJobDetailsRepository.findAll();
    }

    @RequestMapping(value = "/{schedulerName}/{jobgroup}/{jobname}", method = RequestMethod.GET)
    public QuartzJobDetails getJob(@PathVariable String schedulerName, @PathVariable String jobgroup, @PathVariable String jobname) throws SchedulerException {
        LOG.debug("Scheduler value: {}, jobgroup value {}, jobname value {}", schedulerName, jobgroup, jobname);
        return quartzJobDetailsRepository.findOne(new QuartzJobDetailsId().schedulerName(schedulerName).jobGroup(jobgroup).jobName(jobname));
    }
}
