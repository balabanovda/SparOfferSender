package com.sas.spar.repository;

import com.sas.spar.dao2.OffersImportModelDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OffersImportModelRepository extends CrudRepository<OffersImportModelDAO, Long> {

    Optional<OffersImportModelDAO> findById(Long aLong);

    @Override
    OffersImportModelDAO save(OffersImportModelDAO s);
}
