package com.sas.spar.dao2;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "loymax_Filter", schema = "exchange", catalog = "DDS")
public class FilterDAO {

    @Id
    @Column(name = "Filter_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Filter_id_generator")
    @SequenceGenerator(name = "Filter_id_generator", sequenceName = "Filter_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OfferActionsChain_id")
    private OfferActionsChainDAO offerActionsChainDAO;
    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdKey() {
        return idKey;
    }

    public void setIdKey(Long idKey) {
        this.idKey = idKey;
    }

    public OfferActionsChainDAO getOfferActionsChainDAO() {
        return offerActionsChainDAO;
    }

    public void setOfferActionsChainDAO(OfferActionsChainDAO offerActionsChainDAO) {
        this.offerActionsChainDAO = offerActionsChainDAO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterDAO {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
