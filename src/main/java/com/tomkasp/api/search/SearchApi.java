package com.tomkasp.api.search;

import com.tomkasp.entities.SchedulerState;
import com.tomkasp.repository.SchedulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/quartz/search")
public class SearchApi {

    private final SchedulerRepository schedulerRepository;

    @Autowired
    public SearchApi(SchedulerRepository schedulerRepository) {
        this.schedulerRepository = schedulerRepository;
    }

    @RequestMapping(value = "/schedulers", method = RequestMethod.GET)
    public List<SchedulerState> searchForScheduler(@RequestParam String q){
        schedulerRepository.findOne(q);
        return null;
    }
}
