package com.sas.spar.dao2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "loymax_OfferActionsChain", schema = "exchange", catalog = "DDS")
    public class OfferActionsChainDAO {
    @Id
    @Column(name = "OfferActionsChain_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OfferActionsChain_id_generator")
    @SequenceGenerator(name = "OfferActionsChain_id_generator", sequenceName = "OfferActionsChain_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OfferEvent_id")
    private OfferEventDAO offerEventDAO;
    @OneToMany(mappedBy = "offerActionsChainDAO",targetEntity = FilterDAO.class, cascade = {CascadeType.ALL})
    private List filters = null;
    @OneToMany(mappedBy = "offerActionsChainDAO", cascade = {CascadeType.ALL})
    private List<ActionDAO> actions = null;
    @Column(name = "\"order\"")
    private Integer order = null;

    private String name = null;

    public List<FilterDAO> getFilters() {
        return filters;
    }

    public void setFilters(List<FilterDAO> filters) {
        this.filters = filters;
    }

    public List<ActionDAO> getActions() {
        return actions;
    }

    public void setActions(List<ActionDAO> actions) {
        this.actions = actions;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

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

    public OfferEventDAO getOfferEventDAO() {
        return offerEventDAO;
    }

    public void setOfferEventDAO(OfferEventDAO offerEventDAO) {
        this.offerEventDAO = offerEventDAO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferActionsChainDAO {\n");

        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
