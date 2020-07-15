package com.sas.spar.repository;

import com.sas.spar.dao2.PointsOfSalesDAO;
import com.sas.spar.dao2.TimeRefinementDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRefinementRepository extends CrudRepository<TimeRefinementDAO, Long> {
}
