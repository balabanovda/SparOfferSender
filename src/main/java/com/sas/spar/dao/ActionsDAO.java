package com.sas.spar.dao;



import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "lx_Actions", schema = "exchange", catalog = "DDS")
public class ActionsDAO {
    @Id
    @Column(name = "Actions_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Actions_id_generator")
    @SequenceGenerator(name = "Actions_id_generator", sequenceName = "Actions_id_seq", schema = "exchange", allocationSize = 1)
    private Long Id;
    private String Stype;
    @Column(name = "\"percent\"")
    private int percent;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "chains_id", nullable = false)
    private ChainsDAO chainsDAO;

    private boolean distributeToAll;

    private String discountType;

    @OneToMany(mappedBy = "actionsDAO", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<CalculationExclusionDiscountTypesDAO> calculationExclusionDiscountTypesList;
    @Column(name = "\"order\"")
    private int order;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public ChainsDAO getChainsDAO() {
        return chainsDAO;
    }

    public void setChainsDAO(ChainsDAO chainsDAO) {
        this.chainsDAO = chainsDAO;
    }

    public boolean isDistributeToAll() {
        return distributeToAll;
    }

    public List<CalculationExclusionDiscountTypesDAO> getCalculationExclusionDiscountTypesList() {
        return calculationExclusionDiscountTypesList;
    }

    public void setCalculationExclusionDiscountTypesList(List<CalculationExclusionDiscountTypesDAO> calculationExclusionDiscountTypesList) {
        calculationExclusionDiscountTypesList = calculationExclusionDiscountTypesList;
    }

    public void setStype(String $type) {
        this.Stype = $type;
    }

    public String getStype() {
        return this.Stype;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return this.percent;
    }

    public void setDistributeToAll(boolean distributeToAll) {
        this.distributeToAll = distributeToAll;
    }

    public boolean getDistributeToAll() {
        return this.distributeToAll;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return this.order;
    }

    @Override
    public String toString() {
        return "ActionsDAO{" +
                "Id=" + Id +
                ", Stype='" + Stype + '\'' +
                ", percent=" + percent +
                ", distributeToAll=" + distributeToAll +
                ", discountType='" + discountType + '\'' +
                ", calculationExclusionDiscountTypesList=" + calculationExclusionDiscountTypesList +
                ", order=" + order +
                '}';
    }
}