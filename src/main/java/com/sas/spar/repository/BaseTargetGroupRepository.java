package com.sas.spar.repository;

import com.sas.spar.dao2.ActionDAO;
import com.sas.spar.dao2.BaseTargetGroupDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseTargetGroupRepository extends CrudRepository<BaseTargetGroupDAO, Long> {
}
