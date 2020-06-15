package com.sas.spar.dao;



import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;
import java.util.List;
@Entity

@Table(name = "lx_Events", schema = "exchange", catalog = "DDS")
public class EventsDAO
{
    @Id
    @Column(name = "Events_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Events_id_generator")
    @SequenceGenerator(name = "Events_id_generator", sequenceName = "Events_id_seq", schema = "exchange", allocationSize = 1)
    private Long Id;
    private String Stype;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rules_id", nullable = false)
    private RulesDAO rulesDAO;
    @OneToMany(mappedBy = "eventsDAO", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private List<ChainsDAO> chainsDAOList;
    public void setStype(String $type){
        this.Stype = $type;
    }
    public String getStype(){
        return this.Stype;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public RulesDAO getRulesDAO() {
        return rulesDAO;
    }

    public void setRulesDAO(RulesDAO rulesDAO) {
        this.rulesDAO = rulesDAO;
    }

    public List<ChainsDAO> getChainsDAOList() {
        return chainsDAOList;
    }

    public void setChainsDAOList(List<ChainsDAO> chainsDAOList) {
        this.chainsDAOList = chainsDAOList;
    }

    @Override
    public String toString() {
        return "EventsDAO{" +
                "Id=" + Id +
                ", Stype='" + Stype + '\'' +
                ", chainsDAOList=" + chainsDAOList +
                '}';
    }
}