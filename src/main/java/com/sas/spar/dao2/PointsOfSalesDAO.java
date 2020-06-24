package com.sas.spar.dao2;


import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "loymax_PointsOfSales", schema = "exchange", catalog = "DDS")
public class PointsOfSalesDAO {
    @Id
    @Column(name = "PointsOfSales_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PointsOfSales_id_generator")
    @SequenceGenerator(name = "PointsOfSales_id_generator", sequenceName = "PointsOfSales_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;
    @OneToMany(mappedBy = "pointsOfSalesDAO", cascade = {CascadeType.ALL})
    private List<MerchantDAO> merchants = null;

    public List<MerchantDAO> getMerchants() {
        return merchants;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "offer_id", referencedColumnName = "offer_id")
    private OfferDAO offerDAO;
    public void setMerchants(List<MerchantDAO> merchants) {
        this.merchants = merchants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OfferDAO getOfferDAO() {
        return offerDAO;
    }

    public void setOfferDAO(OfferDAO offerDAO) {
        this.offerDAO = offerDAO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PointsOfSales {\n");

        sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
