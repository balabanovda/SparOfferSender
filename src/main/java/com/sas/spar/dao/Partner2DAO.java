package com.sas.spar.dao;



import javax.persistence.*;
@Entity
@Table(name = "lx_Partner", schema = "exchange", catalog = "DDS")
public class Partner2DAO {
    @Id
    @Column(name = "Partner_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Partne_id_generator")
    @SequenceGenerator(name = "Partne_id_generator", sequenceName = "Partne_id_seq", schema = "exchange", allocationSize = 1)
    private Long keyId;
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "partners_id", nullable = false)
    private PartnersDAO partnersDAO;

    public PartnersDAO getPartnersDAO() {
        return partnersDAO;
    }

    public void setPartnersDAO(PartnersDAO partnersDAO) {
        this.partnersDAO = partnersDAO;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public Long getKeyId() {
        return keyId;
    }

    public void setKeyId(Long keyId) {
        this.keyId = keyId;
    }



    @Override
    public String toString() {
        return "PartnerDAO{" +
                "keyId=" + keyId +
                ", id='" + id + '\'' +

                '}';
    }
}
