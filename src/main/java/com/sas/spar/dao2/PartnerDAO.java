package com.sas.spar.dao2;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "loymax_Partner", schema = "exchange", catalog = "DDS")
public class PartnerDAO {
    @Id
    @Column(name = "Partner_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Partner_id_generator")
    @SequenceGenerator(name = "Partner_id_generator", sequenceName = "Partner_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;
    private String id = null;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "offerPartners_id")
    private OfferPartnersDAO offerPartnersDAO;

    public OfferPartnersDAO getOfferPartnersDAO() {
        return offerPartnersDAO;
    }

    public void setOfferPartnersDAO(OfferPartnersDAO offerPartnersDAO) {
        this.offerPartnersDAO = offerPartnersDAO;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Long getIdKey() {
        return idKey;
    }

    public void setIdKey(Long idKey) {
        this.idKey = idKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartnerDAO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}