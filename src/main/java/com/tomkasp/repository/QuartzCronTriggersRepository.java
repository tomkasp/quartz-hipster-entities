package com.tomkasp.repository;

import com.tomkasp.entities.trigers.QuartzCronTriggers;
import com.tomkasp.entities.trigers.QuartzTriggersId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface QuartzCronTriggersRepository extends CrudRepository<QuartzCronTriggers, QuartzTriggersId> {

    @Override
    List<QuartzCronTriggers> findAll();
}
