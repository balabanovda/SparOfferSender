package com.sas.spar.repository;

import com.sas.spar.dao2.OfferRulesDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRulesRepository extends CrudRepository<OfferRulesDAO, Long> {
}
