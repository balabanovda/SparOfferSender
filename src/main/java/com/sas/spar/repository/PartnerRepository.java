package com.sas.spar.repository;

import com.sas.spar.dao2.OfferRulesDAO;
import com.sas.spar.dao2.PartnerDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends CrudRepository<PartnerDAO, Long> {
}
