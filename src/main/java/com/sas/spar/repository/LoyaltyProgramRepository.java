package com.sas.spar.repository;

import com.sas.spar.dao2.HourMinuteModelDAO;
import com.sas.spar.dao2.LoyaltyProgramDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoyaltyProgramRepository extends CrudRepository<LoyaltyProgramDAO, Long> {
}
