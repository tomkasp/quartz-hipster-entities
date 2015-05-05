package com.tomkasp.api;

import com.tomkasp.entities.QuartzLocks;
import com.tomkasp.entities.SchedulerState;
import com.tomkasp.repository.QuartzLocksRepository;
import com.tomkasp.repository.SchedulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/quartz")
public class SchedulerApi {

    private final SchedulerRepository schedulerRepository;
    private final QuartzLocksRepository quartzLocksRepository;


    @Autowired
    public SchedulerApi(SchedulerRepository schedulerRepository, QuartzLocksRepository quartzLocksRepository) {
        this.schedulerRepository = schedulerRepository;
        this.quartzLocksRepository = quartzLocksRepository;
    }

    @RequestMapping(value = "/schedulers", method = RequestMethod.GET)
    public List<SchedulerState> getAllSchedulers() {

        List<SchedulerState> schedulers = schedulerRepository.findAll();
        return schedulers;
    }

    @RequestMapping(value = "/locks", method = RequestMethod.GET)
    public List<QuartzLocks> getAllLocks() {

        List<QuartzLocks> schedulers = quartzLocksRepository.findAll();
        return schedulers;
    }
}