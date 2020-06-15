package com.sas.spar.dao;


import javax.persistence.*;
import java.util.List;
@Entity

@Table(name = "lx_Chains", schema = "exchange", catalog = "DDS")
public class ChainsDAO
{
    @Id
    @Column(name = "Chains_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Chains_id_generator")
    @SequenceGenerator(name = "Chains_id_generator", sequenceName = "Chains_id_seq", schema = "exchange", allocationSize = 1)
    private Long Id;
    @Column(name = "\"order\"")
    private int order;

    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "events_id", nullable = false)
    private EventsDAO eventsDAO;

    @OneToMany(mappedBy = "chainsDAO", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private List<FiltersDAO> filtersList;

    @OneToMany(mappedBy = "chainsDAO", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private List<ActionsDAO> actionsList;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public EventsDAO getEventsDAO() {
        return eventsDAO;
    }

    public void setEventsDAO(EventsDAO eventsDAO) {
        this.eventsDAO = eventsDAO;
    }

    public List<FiltersDAO> getFiltersList() {
        return filtersList;
    }

    public void setFiltersList(List<FiltersDAO> filtersList) {
        this.filtersList = filtersList;
    }

    public List<ActionsDAO> getActionsList() {
        return actionsList;
    }

    public void setActionsList(List<ActionsDAO> actionsList) {
        this.actionsList = actionsList;
    }

    public void setOrder(int order){
        this.order = order;
    }
    public int getOrder(){
        return this.order;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "ChainsDAO{" +
                "Id=" + Id +
                ", order=" + order +
                ", name='" + name + '\'' +
                ", filtersList=" + filtersList +
                ", actionsList=" + actionsList +
                '}';
    }
}
