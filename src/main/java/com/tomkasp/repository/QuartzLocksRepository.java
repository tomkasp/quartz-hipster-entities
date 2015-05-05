package com.tomkasp.repository;


import com.tomkasp.entities.QuartzLocks;
import com.tomkasp.entities.QuartzLocksId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuartzLocksRepository extends CrudRepository<QuartzLocks, QuartzLocksId>{

    List<QuartzLocks> findAll();

}
