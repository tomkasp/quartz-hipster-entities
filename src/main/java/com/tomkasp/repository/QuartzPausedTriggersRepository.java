package com.tomkasp.repository;


import com.tomkasp.entities.trigers.QuartzPausedTriggers;
import com.tomkasp.entities.trigers.QuartzPausedTriggersId;
import org.springframework.data.repository.CrudRepository;

public interface QuartzPausedTriggersRepository extends CrudRepository<QuartzPausedTriggers, QuartzPausedTriggersId>{

}
