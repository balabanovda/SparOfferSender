package com.sas.spar.dao2;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "loymax_Action", schema = "exchange", catalog = "DDS")
public class ActionDAO {
    @Id
    @Column(name = "Action_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Action_id_generator")
    @SequenceGenerator(name = "Action_id_generator", sequenceName = "Action_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OfferActionsChain_id")
    private OfferActionsChainDAO offerActionsChainDAO;
    @Column(name = "\"order\"")
    private Integer order = null;

    private String id = null;

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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
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
        sb.append("class ActionDAO {\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
