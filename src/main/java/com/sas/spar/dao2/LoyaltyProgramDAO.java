package com.sas.spar.dao2;

import javax.persistence.*;

@Entity
@Table(name = "loymax_LoyaltyProgram", schema = "exchange", catalog = "DDS")
public class LoyaltyProgramDAO {
    @Id
    @Column(name = "LoyaltyProgram_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LoyaltyProgram_id_generator")
    @SequenceGenerator(name = "LoyaltyProgram_id_generator", sequenceName = "LoyaltyProgram_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;
    private String id = null;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OfferLoyaltyPrograms_id")
    private OfferLoyaltyProgramsDAO offerLoyaltyProgramsDAO;

    public OfferLoyaltyProgramsDAO getOfferLoyaltyProgramsDAO() {
        return offerLoyaltyProgramsDAO;
    }

    public void setOfferLoyaltyProgramsDAO(OfferLoyaltyProgramsDAO offerLoyaltyProgramsDAO) {
        this.offerLoyaltyProgramsDAO = offerLoyaltyProgramsDAO;
    }

    public Long getIdKey() {
        return idKey;
    }

    public void setIdKey(Long idKey) {
        this.idKey = idKey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoyaltyProgramDAO {\n");

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
