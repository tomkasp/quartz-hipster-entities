package com.tomkasp.repository;

import com.tomkasp.entities.SchedulerState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface SchedulerRepository extends JpaRepository<SchedulerState, String> {

    List<SchedulerState> findAll();
}
