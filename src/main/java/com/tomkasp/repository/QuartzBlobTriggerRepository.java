package com.tomkasp.repository;

import com.tomkasp.entities.trigers.QuartzBlobTriggers;
import com.tomkasp.entities.trigers.QuartzTriggersId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuartzBlobTriggerRepository extends CrudRepository<QuartzBlobTriggers, QuartzTriggersId> {

    @Override
    List<QuartzBlobTriggers> findAll();
}
