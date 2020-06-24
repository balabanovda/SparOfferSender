package com.sas.spar.dao2;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "loymax_OfferLoyaltyPrograms", schema = "exchange", catalog = "DDS")
public class OfferLoyaltyProgramsDAO {
    @Id
    @Column(name = "OfferLoyaltyPrograms_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OfferLoyaltyPrograms_id_generator")
    @SequenceGenerator(name = "OfferLoyaltyPrograms_id_generator", sequenceName = "OfferLoyaltyPrograms_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;
    @OneToMany(mappedBy = "offerLoyaltyProgramsDAO", cascade = {CascadeType.ALL})
    private List<LoyaltyProgramDAO> loyaltyPrograms = null;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "offer_id", referencedColumnName = "offer_id")
    private OfferDAO offerDAO;
    public List<LoyaltyProgramDAO> getLoyaltyPrograms() {
        return loyaltyPrograms;
    }

    public void setLoyaltyPrograms(List<LoyaltyProgramDAO> loyaltyPrograms) {
        this.loyaltyPrograms = loyaltyPrograms;
    }

    public Long getIdKey() {
        return idKey;
    }

    public void setIdKey(Long idKey) {
        this.idKey = idKey;
    }

    public OfferDAO getOfferDAO() {
        return offerDAO;
    }

    public void setOfferDAO(OfferDAO offerDAO) {
        this.offerDAO = offerDAO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferLoyaltyPrograms {\n");

        sb.append("    loyaltyPrograms: ").append(toIndentedString(loyaltyPrograms)).append("\n");
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