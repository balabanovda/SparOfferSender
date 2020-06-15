package com.sas.spar.dao;

import com.sas.spar.web.model.dto.Partner;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lx_Partners", schema = "exchange", catalog = "DDS")
public class PartnersDAO {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Partners_id_generator")
//    @SequenceGenerator(name = "Partners_id_generator", sequenceName = "Partners_id_seq", schema = "exchange", allocationSize = 1)
    @Column(name = "id")
    private Long id;
    @OneToOne
    @MapsId
    private OffersDAO offersDAO;

    @OneToMany(mappedBy = "partnersDAO", cascade = {CascadeType.ALL}, orphanRemoval = true)
    public List<PartnerDAO> partnerDAOList;

    public OffersDAO getOffersDAO() {
        return offersDAO;
    }

    public void setOffersDAO(OffersDAO offersDAO) {
        this.offersDAO = offersDAO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PartnerDAO> getPartnerDAOList() {
        return partnerDAOList;
    }

    public void setPartnerDAOList(List<PartnerDAO> partnerDAOList) {
        this.partnerDAOList = partnerDAOList;
    }

    @Override
    public String toString() {
        return "PartnersDAO{" +
                "id=" + id +
                ", offersDAO="  +
                ", partnerDAOList=" + partnerDAOList+
                '}';
    }
}
