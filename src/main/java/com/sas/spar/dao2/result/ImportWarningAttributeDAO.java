package com.sas.spar.dao2.result;

import javax.persistence.*;

@Entity
@Table(name = "result_loymax_ImportWarningAttribute", schema = "exchange", catalog = "DDS")
public class ImportWarningAttributeDAO {
    @Id
    @Column(name = "ImportWarningAttribute_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ImportWarningAttribute_id_generator")
    @SequenceGenerator(name = "ImportWarningAttribute_id_generator", sequenceName = "ImportWarningAttribute_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ImportWarning_id",  nullable = false)
    private ImportWarningDAO importWarningDAO;
    private String name = null;

    private String value = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ImportWarningDAO getImportWarningDAO() {
        return importWarningDAO;
    }

    public void setImportWarningDAO(ImportWarningDAO importWarningDAO) {
        this.importWarningDAO = importWarningDAO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportWarningAttribute {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

