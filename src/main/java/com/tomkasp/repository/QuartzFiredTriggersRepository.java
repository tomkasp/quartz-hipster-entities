package com.tomkasp.repository;

import com.tomkasp.entities.trigers.QuartzFiredTriggers;
import com.tomkasp.entities.trigers.QuartzFiredTriggersId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface QuartzFiredTriggersRepository extends CrudRepository<QuartzFiredTriggers, QuartzFiredTriggersId>{

    List<QuartzFiredTriggers> findAll();
}
