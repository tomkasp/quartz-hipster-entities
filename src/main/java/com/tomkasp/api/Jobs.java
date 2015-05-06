package com.tomkasp.api;

import com.tomkasp.entities.QuartzJobDetails;
import com.tomkasp.repository.QuartzJobDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quartz")
public class Jobs {

    private final QuartzJobDetailsRepository quartzJobDetailsRepository;

    @Autowired
    public Jobs(QuartzJobDetailsRepository quartzJobDetailsRepository) {
        this.quartzJobDetailsRepository = quartzJobDetailsRepository;
    }

    @RequestMapping(value = "/jobdetails", method = RequestMethod.GET)
    public List<QuartzJobDetails> getAllQuartzJobDetails(){
        return quartzJobDetailsRepository.findAll();
    }

}
