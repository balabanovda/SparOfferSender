package com.sas.spar.dao2.result;


import javax.persistence.*;

@Entity
@Table(name = "result_loymax_OfferImportError", schema = "exchange", catalog = "DDS")
public class OfferImportErrorDAO {

    @Id
    @Column(name = "OfferImportError_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OfferImportError_id_generator")
    @SequenceGenerator(name = "OfferImportError_id_generator", sequenceName = "OfferImportError_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;

    private String offerID = null;

    private Integer errorCode = null;

    private String errorMessage = null;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OffersImportResponse_id",  nullable = false)
    private OffersImportResponseDAO offersImportResponseDAO;

    public String getOfferID() {
        return offerID;
    }

    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }


    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        sb.append("class OfferImportError {\n");

        sb.append("    offerID: ").append(toIndentedString(offerID)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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


