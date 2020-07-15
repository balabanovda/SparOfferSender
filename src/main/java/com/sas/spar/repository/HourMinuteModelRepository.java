package com.sas.spar.repository;

import com.sas.spar.dao2.FilterDAO;
import com.sas.spar.dao2.HourMinuteModelDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HourMinuteModelRepository extends CrudRepository<HourMinuteModelDAO, Long> {
}
