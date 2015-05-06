package com.tomkasp.repository;


import com.tomkasp.entities.trigers.QuartzTriggers;
import com.tomkasp.entities.trigers.QuartzTriggersId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuartzTriggersRepository extends CrudRepository<QuartzTriggers, QuartzTriggersId>{

    @Override
    List<QuartzTriggers> findAll();
}
