package com.tomkasp.repository;

import com.tomkasp.entities.QuartzJobDetails;
import com.tomkasp.entities.QuartzJobDetailsId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuartzJobDetailsRepository extends CrudRepository<QuartzJobDetails, QuartzJobDetailsId> {

    List<QuartzJobDetails> findAll();

}
