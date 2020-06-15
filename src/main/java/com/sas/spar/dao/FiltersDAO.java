package com.sas.spar.dao;


import javax.persistence.*;
@Entity
@Table(name = "lx_Filters", schema = "exchange", catalog = "DDS")

public class FiltersDAO
{
    @Id
    @Column(name = "Filters_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Filters_id_generator")
    @SequenceGenerator(name = "Filters_id_generator", sequenceName = "Filters_id_seq", schema = "exchange", allocationSize = 1)
    private Long Id;
    private String Stype;

    private String operator;

    private int firstValue;

    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "chains_id", nullable = false)
    private ChainsDAO chainsDAO;

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

    public void setStype(String stype){
        this.Stype = stype;
    }
    public String getStype(){
        return this.Stype;
    }
    public void setOperator(String operator){
        this.operator = operator;
    }
    public String getOperator(){
        return this.operator;
    }
    public void setFirstValue(int firstValue){
        this.firstValue = firstValue;
    }
    public int getFirstValue(){
        return this.firstValue;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "FiltersDAO{" +
                "Id=" + Id +
                ", Stype='" + Stype + '\'' +
                ", operator='" + operator + '\'' +
                ", firstValue=" + firstValue +
                ", name='" + name + '\'' +
                '}';
    }
}