package com.sas.spar.dao;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lx_Root", schema = "exchange", catalog = "DDS")
public class RootDAO {
    @Id
    @Column(name = "root_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "root_id_generator")
    @SequenceGenerator(name = "root_id_generator", sequenceName = "root_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;
    private String version;
    @OneToMany(mappedBy = "rootDAO", cascade = {CascadeType.ALL})
    private List<OffersDAO> offersList;

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OffersDAO> getOffersList() {
        return offersList;
    }

    public void setOffersList(List<OffersDAO> offersList) {
        this.offersList = offersList;
    }

    @Override
    public String toString() {
        return "RootDAO{" +
                "id=" + id +
                ", version='" + version + '\'' +
                ", offersList="  +offersList+
                '}';
    }
}