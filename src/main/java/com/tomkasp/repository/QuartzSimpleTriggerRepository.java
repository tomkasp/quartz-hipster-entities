package com.tomkasp.repository;

import com.tomkasp.entities.trigers.QuartzSimpleTriggers;
import com.tomkasp.entities.trigers.QuartzTriggersId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuartzSimpleTriggerRepository extends CrudRepository<QuartzSimpleTriggers, QuartzTriggersId> {

    List<QuartzSimpleTriggers> findAll();
}
