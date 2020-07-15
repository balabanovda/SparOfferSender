package com.sas.spar.repository;

import com.sas.spar.dao2.ActionDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends CrudRepository<ActionDAO, Long> {
}
