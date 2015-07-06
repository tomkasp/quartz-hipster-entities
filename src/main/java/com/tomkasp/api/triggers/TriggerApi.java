package com.tomkasp.api.triggers;

import com.tomkasp.api.SchedulerApi;
import com.tomkasp.api.TriggersEntityApi;
import com.tomkasp.entities.SchedulerState;
import com.tomkasp.entities.trigers.QuartzTriggers;
import com.tomkasp.entities.trigers.QuartzTriggersId;
import com.tomkasp.repository.QuartzTriggersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/quartz/triggers")
public class TriggerApi {

    private final QuartzTriggersRepository quartzTriggersRepository;

    @Autowired
    public TriggerApi(QuartzTriggersRepository quartzTriggersRepository) {
        this.quartzTriggersRepository = quartzTriggersRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<QuartzTriggers> getAllTriggers() {
        List<QuartzTriggers> quartzTriggers = quartzTriggersRepository.findAll();
        return quartzTriggers;
    }

    @RequestMapping(value = "/{scheduler}/{triggergroup}/{triggername}", method = RequestMethod.GET)
    public ResponseEntity<QuartzTriggers> getQuartzCronTrigger(@RequestParam String scheduler, @RequestParam String triggergroup, @RequestParam String triggername) {
        QuartzTriggersId quartzTriggersId = new QuartzTriggersId().schedulerName(scheduler).triggerGroup(triggergroup).triggerName(triggername);
        QuartzTriggers quartzTrigger = quartzTriggersRepository.findOne(quartzTriggersId);
        quartzTrigger.add(linkTo(methodOn(TriggerApi.class).getQuartzCronTrigger(scheduler, triggergroup, triggername)).withSelfRel());
        quartzTrigger.add(linkTo(methodOn(SchedulerApi.class).getScheduler(scheduler)).withSelfRel());
        quartzTrigger.add(linkTo(methodOn(TriggersEntityApi.class).getAllFiredTriggers()).withRel("Fired triggers"));
        quartzTrigger.add(linkTo(methodOn(TriggersEntityApi.class).getAllBlobTriggers()).withRel("Blog triggers"));
        quartzTrigger.add(linkTo(methodOn(TriggersEntityApi.class).getAllCronTriggers()).withRel("Cron triggers"));
        quartzTrigger.add(linkTo(methodOn(TriggersEntityApi.class).getAllSimpleTriggers()).withRel("Simple triggers"));
        quartzTrigger.add(linkTo(methodOn(TriggersEntityApi.class).getAllPausedJobs()).withRel("Get Paused jobs"));
        quartzTrigger.add(linkTo(methodOn(TriggerApi.class).getAllTriggers()).withRel("All triggers"));
        return new ResponseEntity<QuartzTriggers>(quartzTrigger, HttpStatus.OK);

    }
}
