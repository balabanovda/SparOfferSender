//package com.sas.spar.dao2;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "loymax_BaseTargetGroup", schema = "exchange", catalog = "DDS")
//public class BaseTargetGroupDAO {
//
//    @Id
//    @Column(name = "BaseTargetGroup_id")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BaseTargetGroup_id_generator")
//    @SequenceGenerator(name = "BaseTargetGroup_id_generator", sequenceName = "BaseTargetGroup_id_seq", schema = "exchange", allocationSize = 1)
//    private Long id;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "Offer_id")
//    private OfferDAO offerDAO;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public OfferDAO getOfferDAO() {
//        return offerDAO;
//    }
//
//    public void setOfferDAO(OfferDAO offerDAO) {
//        this.offerDAO = offerDAO;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("class BaseTargetGroupDAO {\n");
//
//        sb.append("}");
//        return sb.toString();
//    }
//
//
//
//}
