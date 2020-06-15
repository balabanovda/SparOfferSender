package com.sas.spar.dao;



import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "lx_Rules", schema = "exchange", catalog = "DDS")

public class RulesDAO
{
    @Id
    @Column(name = "Rules_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Rules_id_generator")
    @SequenceGenerator(name = "Rules_id_generator", sequenceName = "Rules_id_seq", schema = "exchange", allocationSize = 1)
    private Long Id;

    @OneToOne
    @MapsId
    private OffersDAO offersDAO;

    @OneToMany(mappedBy = "rulesDAO", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private List<EventsDAO> eventsDAOList;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public OffersDAO getOffersDAO() {
        return offersDAO;
    }

    public void setOffersDAO(OffersDAO offersDAO) {
        this.offersDAO = offersDAO;
    }

    public List<EventsDAO> getEventsDAOList() {
        return eventsDAOList;
    }

    public void setEventsDAOList(List<EventsDAO> eventsDAOList) {
        this.eventsDAOList = eventsDAOList;
    }

    @Override
    public String toString() {
        return "RulesDAO{" +
                "Id=" + Id +
                ", eventsDAOList=" + eventsDAOList +
                '}';
    }
}