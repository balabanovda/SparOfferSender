package com.sas.spar.repository;

import com.sas.spar.dao2.TimeRefinementDAO;
import com.sas.spar.dao2.result.ValidationErrorDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationErrorRepository  extends CrudRepository<ValidationErrorDAO, Long> {
}
