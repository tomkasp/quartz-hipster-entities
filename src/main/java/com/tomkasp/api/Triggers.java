package com.tomkasp.api;

import com.tomkasp.entities.trigers.QuartzCronTriggers;
import com.tomkasp.entities.trigers.QuartzFiredTriggers;
import com.tomkasp.entities.trigers.QuartzSimpleTriggers;
import com.tomkasp.entities.trigers.QuartzTriggers;
import com.tomkasp.repository.QuartzCronTriggersRepository;
import com.tomkasp.repository.QuartzFiredTriggersRepository;
import com.tomkasp.repository.QuartzSimpleTriggerRepository;
import com.tomkasp.repository.QuartzTriggersRepository;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quartz/triggers")
public class Triggers {

    private final QuartzFiredTriggersRepository quartzFiredTriggersRepository;
    private final QuartzTriggersRepository quartzTriggersRepository;
    private final QuartzCronTriggersRepository quartzCronTriggersRepository;
    private final QuartzSimpleTriggerRepository quartzSimpleTriggerRepository;

    @Autowired
    public Triggers(QuartzFiredTriggersRepository quartzFiredTriggersRepository, QuartzTriggersRepository quartzTriggersRepository, QuartzCronTriggersRepository quartzCronTriggersRepository, QuartzSimpleTriggerRepository quartzSimpleTriggerRepository) {
        this.quartzFiredTriggersRepository = quartzFiredTriggersRepository;
        this.quartzTriggersRepository = quartzTriggersRepository;
        this.quartzCronTriggersRepository = quartzCronTriggersRepository;
        this.quartzSimpleTriggerRepository = quartzSimpleTriggerRepository;
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


    @RequestMapping(value = "/cron", method = RequestMethod.GET)
    public List<QuartzCronTriggers> getAllCronTriggers() {
        return quartzCronTriggersRepository.findAll();
    }


    @RequestMapping(value = "/simple", method = RequestMethod.GET)
    public List<QuartzSimpleTriggers> getAllSimpleTriggers() {
        return quartzSimpleTriggerRepository.findAll();
    }

    @RequestMapping(value = "/blob", method = RequestMethod.GET)
    public String getAllBlob()

    {
        return "";
    }
}
