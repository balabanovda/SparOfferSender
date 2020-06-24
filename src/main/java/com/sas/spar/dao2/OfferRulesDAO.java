package com.sas.spar.dao2;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "loymax_OfferRules", schema = "exchange", catalog = "DDS")
public class OfferRulesDAO {

    @Id
    @Column(name = "OfferRules_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OfferRules_id_generator")
    @SequenceGenerator(name = "OfferRules_id_generator", sequenceName = "OfferRules_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;
    @OneToMany(mappedBy = "offerRulesDAO", cascade = {CascadeType.ALL})
    private List<OfferEventDAO> events = null;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "offer_id", referencedColumnName = "offer_id")
    private OfferDAO offerDAO;
    public List<OfferEventDAO> getEvents() {
        return events;
    }

    public void setEvents(List<OfferEventDAO> events) {
        this.events = events;
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
        sb.append("class OfferRules {\n");

        sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
