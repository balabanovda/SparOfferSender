package com.sas.spar.repository;

import com.sas.spar.dao2.OfferEventDAO;
import com.sas.spar.dao2.OfferLoyaltyProgramsDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferLoyaltyProgramsRepository extends CrudRepository<OfferLoyaltyProgramsDAO, Long> {
}
