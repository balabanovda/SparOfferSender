package com.sas.spar.dao2;

import javax.persistence.*;

@Entity
@Table(name = "loymax_Merchant", schema = "exchange", catalog = "DDS")
public class MerchantDAO {
    @Id
    @Column(name = "Merchant_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Merchant_id_generator")
    @SequenceGenerator(name = "Merchant_id_generator", sequenceName = "Merchant_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;

    private String id = null;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PointsOfSalesDAO_id")
    private PointsOfSalesDAO pointsOfSalesDAO;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PointsOfSalesDAO getPointsOfSalesDAO() {
        return pointsOfSalesDAO;
    }

    public void setPointsOfSalesDAO(PointsOfSalesDAO pointsOfSalesDAO) {
        this.pointsOfSalesDAO = pointsOfSalesDAO;
    }

    public Long getIdKey() {
        return idKey;
    }

    public void setIdKey(Long idKey) {
        this.idKey = idKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MerchantDAO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
