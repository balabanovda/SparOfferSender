package com.sas.spar.repository;

import com.sas.spar.dao.RootDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RootRepository extends CrudRepository<RootDAO, Long> {


    Optional<RootDAO> findById(Long id);


}