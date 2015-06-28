package com.tomkasp.repository;


import com.tomkasp.entities.trigers.QuartzPausedTriggers;
import com.tomkasp.entities.trigers.QuartzPausedTriggersId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuartzPausedTriggersRepository extends CrudRepository<QuartzPausedTriggers, QuartzPausedTriggersId>{

    List<QuartzPausedTriggers> findAll();
}
