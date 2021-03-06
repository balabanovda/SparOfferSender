package com.sas.spar.repository;

import com.sas.spar.dao2.MerchantDAO;
import com.sas.spar.dao2.OfferActionsChainDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferActionsChainRepository extends CrudRepository<OfferActionsChainDAO, Long> {
}
