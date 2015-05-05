package com.tomkasp.repository;

import com.tomkasp.entities.SchedulerState;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface SchedulerRepository extends CrudRepository<SchedulerState, String> {

    List<SchedulerState> findAll();
}
