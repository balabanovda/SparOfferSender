package com.sas.spar.dao2;


import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "loymax_CardListFilter", schema = "exchange", catalog = "DDS")
public class CardListFilterDAO extends FilterDAO{

//    @Id
//    @Column(name = "CardListFilter_id")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CardListFilter_id_generator")
//    @SequenceGenerator(name = "CardListFilter_id_generator", sequenceName = "CardListFilter_id_seq", schema = "exchange", allocationSize = 1)
//    private Long id;



    private String name = null;
    @ElementCollection
    @CollectionTable(schema = "exchange", catalog = "DDS", name="loymax_cards_number", joinColumns=@JoinColumn(table = "loymax_Filter",name="Filter_id"))
    @Column(name="cards_number")
    private List<String> cards = null;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OfferActionsChain_id")
    private OfferActionsChainDAO offerActionsChainDAO;


    public OfferActionsChainDAO getOfferActionsChainDAO() {
        return offerActionsChainDAO;
    }

    public void setOfferActionsChainDAO(OfferActionsChainDAO offerActionsChainDAO) {
        this.offerActionsChainDAO = offerActionsChainDAO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<String> getCards() {
        return cards;
    }

    public void setCards(List<String> cards) {
        this.cards = cards;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardListFilterDto {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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

