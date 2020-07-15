package com.sas.spar.repository;

import com.sas.spar.dao2.BaseTargetGroupDAO;
import com.sas.spar.dao2.CardListFilterDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardListFilterRepository extends CrudRepository<CardListFilterDAO, Long> {
}
