package com.sas.spar.dao2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "loymax_OfferPartners", schema = "exchange", catalog = "DDS")
public class OfferPartnersDAO {
    @Id
    @Column(name = "OfferPartners_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OfferPartners_id_generator")
    @SequenceGenerator(name = "OfferPartners_id_generator", sequenceName = "OfferPartners_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "offer_id", referencedColumnName = "offer_id")
    private OfferDAO offerDAO;

    @OneToMany(mappedBy = "offerPartnersDAO",orphanRemoval = true, cascade = {CascadeType.ALL})
    private List<PartnerDAO> partners = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OfferDAO getOfferDAO() {
        return offerDAO;
    }

    public void setOfferDAO(OfferDAO offerDAO) {
        this.offerDAO = offerDAO;
    }

    public List<PartnerDAO> getPartners() {
        return partners;
    }

    public void setPartners(List<PartnerDAO> partners) {
        this.partners = partners;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferPartners {\n");

        sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
