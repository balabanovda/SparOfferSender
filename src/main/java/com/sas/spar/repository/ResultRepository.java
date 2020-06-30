package com.sas.spar.repository;

import com.sas.spar.dao2.result.ResultModelOfOffersImportResponseDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends CrudRepository<ResultModelOfOffersImportResponseDAO, Long> {
}
