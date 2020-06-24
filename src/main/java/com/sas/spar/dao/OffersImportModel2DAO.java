package com.sas.spar.dao;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "lx_OffersImportModel", schema = "exchange", catalog = "DDS")
public class OffersImportModel2DAO {

    @Id
    private Long id;
}
