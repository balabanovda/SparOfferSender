package com.sas.spar.dao2.result;


import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "loymax_ImportWarning", schema = "exchange", catalog = "DDS")
public class ImportWarningDAO {
    @Id
    @Column(name = "ImportWarning_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ImportWarning_id_generator")
    @SequenceGenerator(name = "ImportWarning_id_generator", sequenceName = "ImportWarning_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OfferImportWarning_id", referencedColumnName = "OfferImportWarning_id")
    OfferImportWarningDAO offerImportWarningDAO;
//    @ElementCollection
//    private List<String> descriptions = null;
    @OneToMany(mappedBy = "importWarningDAO")
    private List<ImportWarningAttributeDAO> attributes = null;

//    public List<String> getDescriptions() {
//        return descriptions;
//    }
//
//    public void setDescriptions(List<String> descriptions) {
//        this.descriptions = descriptions;
//    }

    public List<ImportWarningAttributeDAO> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ImportWarningAttributeDAO> attributes) {
        this.attributes = attributes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OfferImportWarningDAO getOfferImportWarningDAO() {
        return offerImportWarningDAO;
    }

    public void setOfferImportWarningDAO(OfferImportWarningDAO offerImportWarningDAO) {
        this.offerImportWarningDAO = offerImportWarningDAO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportWarning {\n");

//        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

