package com.sas.spar.dao2;



import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;

@Entity
@Table(name = "loymax_GoodsGroup", schema = "exchange", catalog = "DDS")
public class BaseGoodsGroupDAO {

    @Id
    @Column(name = "BaseGoodsGroup_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BaseGoodsGroup_id_generator")
    @SequenceGenerator(name = "BaseGoodsGroup_id_generator", sequenceName = "BaseGoodsGroup_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ChequePositionGoodsFilter_id",  nullable = false)
    private ChequePositionGoodsFilterDAO chequePositionGoodsFilterDAO;



    private String id = null;

    private String goodsGroupState = null;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsGroupState() {
        return goodsGroupState;
    }

    public void setGoodsGroupState(String goodsGroupState) {
        this.goodsGroupState = goodsGroupState;
    }

    public Long getIdKey() {
        return idKey;
    }

    public void setIdKey(Long idKey) {
        this.idKey = idKey;
    }

    public ChequePositionGoodsFilterDAO getChequePositionGoodsFilterDAO() {
        return chequePositionGoodsFilterDAO;
    }

    public void setChequePositionGoodsFilterDAO(ChequePositionGoodsFilterDAO chequePositionGoodsFilterDAO) {
        this.chequePositionGoodsFilterDAO = chequePositionGoodsFilterDAO;
    }


    @Override
    public String toString() {
        return "BaseGoodsGroupDAO{" +
                ", id='" + id + '\'' +
                ", goodsGroupState='" + goodsGroupState + '\'' +
                '}';
    }
}

