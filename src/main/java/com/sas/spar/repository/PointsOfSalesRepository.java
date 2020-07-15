package com.sas.spar.repository;

import com.sas.spar.dao2.PartnerDAO;
import com.sas.spar.dao2.PointsOfSalesDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointsOfSalesRepository extends CrudRepository<PointsOfSalesDAO, Long> {
}
