package com.sas.spar.dao2.result;


import javax.persistence.*;

@Entity
@Table(name = "result_loymax_OfferImportWarning", schema = "exchange", catalog = "DDS")
public class OfferImportWarningDAO {
    @Id
    @Column(name = "OfferImportWarning_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OfferImportWarning_id_generator")
    @SequenceGenerator(name = "OfferImportWarning_id_generator", sequenceName = "OfferImportWarning_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;
    private String offerId = null;
    @OneToOne(mappedBy = "offerImportWarningDAO")
    private ImportWarningDAO warning = null;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OffersImportResponse_id",  nullable = false)
    private OffersImportResponseDAO offersImportResponseDAO;

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public ImportWarningDAO getWarning() {
        return warning;
    }

    public void setWarning(ImportWarningDAO warning) {
        this.warning = warning;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffersImportResponseDAO getOffersImportResponseDAO() {
        return offersImportResponseDAO;
    }

    public void setOffersImportResponseDAO(OffersImportResponseDAO offersImportResponseDAO) {
        this.offersImportResponseDAO = offersImportResponseDAO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferImportWarning {\n");

        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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

