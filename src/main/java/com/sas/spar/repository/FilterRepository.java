package com.sas.spar.repository;

import com.sas.spar.dao2.FilterDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilterRepository extends CrudRepository<FilterDAO, Long> {
}
