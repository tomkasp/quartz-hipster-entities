package com.tomkasp.api;

import com.tomkasp.api.triggers.TriggerApi;
import com.tomkasp.api.triggers.TriggersEntityApi;
import com.tomkasp.entities.QuartzLocks;
import com.tomkasp.entities.SchedulerState;
import com.tomkasp.repository.QuartzLocksRepository;
import com.tomkasp.repository.SchedulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

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

    @RequestMapping(value = "/schedulers/{id}")
    public ResponseEntity getScheduler(@PathVariable String id) {
        SchedulerState schedulerState = schedulerRepository.findOne(id);
        schedulerState.add(linkTo(methodOn(SchedulerApi.class).getScheduler(id)).withSelfRel());
        schedulerState.add(linkTo(methodOn(TriggersEntityApi.class).getAllFiredTriggers()).withRel("Fired triggers"));
        schedulerState.add(linkTo(methodOn(TriggersEntityApi.class).getAllBlobTriggers()).withRel("Blog triggers"));
        schedulerState.add(linkTo(methodOn(TriggersEntityApi.class).getAllCronTriggers()).withRel("Cron triggers"));
        schedulerState.add(linkTo(methodOn(TriggersEntityApi.class).getAllSimpleTriggers()).withRel("Simple triggers"));
        schedulerState.add(linkTo(methodOn(TriggersEntityApi.class).getAllPausedJobs()).withRel("Get Paused jobs"));
        schedulerState.add(linkTo(methodOn(TriggerApi.class).getAllTriggers()).withRel("All triggers"));
        return new ResponseEntity<SchedulerState>(schedulerState, HttpStatus.OK);
    }

    @RequestMapping(value = "/locks", method = RequestMethod.GET)
    public List<QuartzLocks> getAllLocks() {

        List<QuartzLocks> schedulers = quartzLocksRepository.findAll();
        return schedulers;
    }
}