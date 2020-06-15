package com.sas.spar.dao;



import javax.persistence.*;

@Entity
@Table(name = "lx_CalculationExclusionDiscountTypes", schema = "exchange", catalog = "DDS")
public class CalculationExclusionDiscountTypesDAO {

    @Id
    @Column(name = "CalculationExclusionDiscountTypes_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CalculationExclusionDiscountTypes_id_generator")
    @SequenceGenerator(name = "CalculationExclusionDiscountTypes_id_generator", sequenceName = "CalculationExclusionDiscountTypes_id_seq", schema = "exchange", allocationSize = 1)
    private Long Id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "actions_id", nullable = false)
    private ActionsDAO actionsDAO;

    public ActionsDAO getActionsDAO() {
        return actionsDAO;
    }

    public void setActionsDAO(ActionsDAO actionsDAO) {
        this.actionsDAO = actionsDAO;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "CalculationExclusionDiscountTypesDAO{" +
                "Id=" + Id +
                '}';
    }
}
