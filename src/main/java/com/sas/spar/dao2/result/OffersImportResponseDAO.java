package com.sas.spar.dao2.result;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "result_loymax_OffersImportResponse", schema = "exchange", catalog = "DDS")
public class OffersImportResponseDAO {

    @Id
    @Column(name = "OffersImportResponse_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OffersImportResponse_id_generator")
    @SequenceGenerator(name = "OffersImportResponse_id_generator", sequenceName = "OffersImportResponse_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;

    private Integer inserted = null;

    private Integer updated = null;

    private Integer skipped = null;
    @OneToMany(mappedBy = "offersImportResponseDAO", cascade = CascadeType.ALL)
    private List<OfferImportErrorDAO> errors = null;
    @OneToMany(mappedBy = "offersImportResponseDAO", cascade = CascadeType.ALL)
    private List<OfferImportWarningDAO> offerImportWarnings = null;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ResultModelOfOffersImportResponse_id", referencedColumnName = "ResultModelOfOffersImportResponse_id")
    private ResultModelOfOffersImportResponseDAO resultModelOfOffersImportResponseDAO;

    public Integer getInserted() {
        return inserted;
    }

    public void setInserted(Integer inserted) {
        this.inserted = inserted;
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public Integer getSkipped() {
        return skipped;
    }

    public void setSkipped(Integer skipped) {
        this.skipped = skipped;
    }

    public List<OfferImportErrorDAO> getErrors() {
        return errors;
    }

    public void setErrors(List<OfferImportErrorDAO> errors) {
        this.errors = errors;
    }

    public List<OfferImportWarningDAO> getOfferImportWarnings() {
        return offerImportWarnings;
    }

    public void setOfferImportWarnings(List<OfferImportWarningDAO> offerImportWarnings) {
        this.offerImportWarnings = offerImportWarnings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ResultModelOfOffersImportResponseDAO getResultModelOfOffersImportResponseDAO() {
        return resultModelOfOffersImportResponseDAO;
    }

    public void setResultModelOfOffersImportResponseDAO(ResultModelOfOffersImportResponseDAO resultModelOfOffersImportResponseDAO) {
        this.resultModelOfOffersImportResponseDAO = resultModelOfOffersImportResponseDAO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OffersImportResponse {\n");

        sb.append("    inserted: ").append(toIndentedString(inserted)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    offerImportWarnings: ").append(toIndentedString(offerImportWarnings)).append("\n");
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

