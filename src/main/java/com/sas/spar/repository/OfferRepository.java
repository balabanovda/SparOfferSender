package com.sas.spar.repository;

import com.sas.spar.dao2.OfferDAO;
import com.sas.spar.dao2.OfferPartnersDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface OfferRepository extends CrudRepository<OfferDAO, Long> {
}
