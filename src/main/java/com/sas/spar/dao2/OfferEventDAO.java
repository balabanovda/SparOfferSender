package com.sas.spar.dao2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "loymax_OfferEvent", schema = "exchange", catalog = "DDS")
public class OfferEventDAO {

    @Id
    @Column(name = "OfferEvent_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OfferEvent_id_generator")
    @SequenceGenerator(name = "OfferEvent_id_generator", sequenceName = "OfferRules_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OfferRules_id")
    private OfferRulesDAO offerRulesDAO;
    @OneToMany(mappedBy = "offerEventDAO", cascade = {CascadeType.ALL})
    private List<OfferActionsChainDAO> chains = null;


    public List<OfferActionsChainDAO> getChains() {
        return chains;
    }

    public void setChains(List<OfferActionsChainDAO> chains) {
        this.chains = chains;
    }

    public Long getIdKey() {
        return idKey;
    }

    public void setIdKey(Long idKey) {
        this.idKey = idKey;
    }

    public OfferRulesDAO getOfferRulesDAO() {
        return offerRulesDAO;
    }

    public void setOfferRulesDAO(OfferRulesDAO offerRulesDAO) {
        this.offerRulesDAO = offerRulesDAO;
    }

    @Override
    public String toString() {
        return "OfferEventDAO{" +
                "idKey=" + idKey +
                ", chains=" + chains +
                '}';
    }
}