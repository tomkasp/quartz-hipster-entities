package com.tomkasp.api;

import com.tomkasp.entities.trigers.*;
import com.tomkasp.repository.*;
import com.wordnik.swagger.annotations.ApiOperation;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/quartz/triggers")
public class TriggersEntityApi {

    static final Logger LOG = LoggerFactory.getLogger(TriggersEntityApi.class);

    private final QuartzFiredTriggersRepository quartzFiredTriggersRepository;
    private final QuartzTriggersRepository quartzTriggersRepository;
    private final QuartzCronTriggersRepository quartzCronTriggersRepository;
    private final QuartzSimpleTriggerRepository quartzSimpleTriggerRepository;
    private final QuartzBlobTriggerRepository quartzBlobTriggerRepository;
    private final QuartzPausedTriggersRepository quartzPausedTriggersRepository;

    @Autowired
    public TriggersEntityApi(QuartzFiredTriggersRepository quartzFiredTriggersRepository, QuartzTriggersRepository quartzTriggersRepository, QuartzCronTriggersRepository quartzCronTriggersRepository, QuartzSimpleTriggerRepository quartzSimpleTriggerRepository, QuartzBlobTriggerRepository quartzBlobTriggerRepository, QuartzPausedTriggersRepository quartzPausedTriggersRepository) {
        this.quartzFiredTriggersRepository = quartzFiredTriggersRepository;
        this.quartzTriggersRepository = quartzTriggersRepository;
        this.quartzCronTriggersRepository = quartzCronTriggersRepository;
        this.quartzSimpleTriggerRepository = quartzSimpleTriggerRepository;
        this.quartzBlobTriggerRepository = quartzBlobTriggerRepository;
        this.quartzPausedTriggersRepository = quartzPausedTriggersRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<QuartzTriggers> getAllTriggers() {
        List<QuartzTriggers> quartzTriggers = quartzTriggersRepository.findAll();
        return quartzTriggers;
    }

    @ApiOperation(value = "Currently running trigger")
    @RequestMapping(value = "/fired", method = RequestMethod.GET)
    public List<QuartzFiredTriggers> getAllFiredTriggers() {
        return quartzFiredTriggersRepository.findAll();
    }

    @RequestMapping(value = "/fired/{schedulername}/{entryid}")
    public QuartzFiredTriggers getFiredTrigger(@RequestParam String schedulerName, @RequestParam String entryid){
        return quartzFiredTriggersRepository.findOne(new QuartzFiredTriggersId().schedulerName(schedulerName).entryId(entryid));
    }

    @RequestMapping(value = "/cron", method = RequestMethod.GET)
    public List<QuartzCronTriggers> getAllCronTriggers() {
        return quartzCronTriggersRepository.findAll();
    }

    @RequestMapping(value = "/cron", method = RequestMethod.POST)
    public void createCronTrigger(@RequestBody QuartzCronTriggers quartzCronTriggers) throws SchedulerException, ParseException {
        LOG.debug("Attempt to create cron trigger {}", quartzCronTriggers);
        quartzCronTriggersRepository.save(quartzCronTriggers);
    }

    @RequestMapping(value = "/cron/{scheduler}/{triggergroup}/{triggername}", method = RequestMethod.GET)
    public QuartzCronTriggers getQuartzTrigger(@PathVariable String scheduler, @PathVariable String triggergroup, @PathVariable String triggername) {
        return quartzCronTriggersRepository.findOne(
                new QuartzTriggersId()
                        .schedulerName(scheduler)
                        .triggerGroup(triggergroup)
                        .triggerName(triggername));
    }

    @RequestMapping(value = "/simple", method = RequestMethod.GET)
    public List<QuartzSimpleTriggers> getAllSimpleTriggers() {
        return quartzSimpleTriggerRepository.findAll();
    }

    @RequestMapping(value = "/simple/{scheduler}/{triggergroup/{triggername}", method = RequestMethod.GET)
    public QuartzSimpleTriggers getSimpleTrigger(@PathVariable String scheduler, @PathVariable String triggergroup, @PathVariable String triggerName) {
        return quartzSimpleTriggerRepository.findOne(
                new QuartzTriggersId()
                        .schedulerName(scheduler)
                        .triggerGroup(triggergroup)
                        .triggerName(triggerName)
        );
    }

    @RequestMapping(value = "/blob", method = RequestMethod.GET)
    public List<QuartzBlobTriggers> getAllBlobTriggers()
    {
        return quartzBlobTriggerRepository.findAll();
    }

    @RequestMapping(value = "/blob/{scheduler}/{triggergroup/{triggername}", method = RequestMethod.GET)
    public QuartzBlobTriggers getBlobTrigger(@PathVariable String scheduler, @PathVariable String triggergroup, @PathVariable String triggerName){
        return quartzBlobTriggerRepository.findOne(new QuartzTriggersId().schedulerName(scheduler).triggerGroup(triggergroup).triggerName(triggerName));
    }

    public List<QuartzPausedTriggers> getAllPausedJobs(){
        return quartzPausedTriggersRepository.findAll();
    }
}
