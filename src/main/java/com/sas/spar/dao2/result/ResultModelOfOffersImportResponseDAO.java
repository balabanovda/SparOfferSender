package com.sas.spar.dao2.result;

import javax.persistence.*;

@Entity
@Table(name = "result_loymax_ResultModelOfOffersImportResponse", schema = "exchange", catalog = "DDS")
public class ResultModelOfOffersImportResponseDAO {

    @Id
    @Column(name = "ResultModelOfOffersImportResponse_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ResultModelOfOffersImportResponse_id_generator")
    @SequenceGenerator(name = "ResultModelOfOffersImportResponse_id_generator", sequenceName = "ResultModelOfOffersImportResponse_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;

    @OneToOne(mappedBy = "resultModelOfOffersImportResponseDAO",cascade = {CascadeType.ALL})
    private ResultDAO result = null;
    @OneToOne(mappedBy = "resultModelOfOffersImportResponseDAO", cascade = CascadeType.ALL)
    private OffersImportResponseDAO data = null;


    public ResultDAO getResult() {
        return result;
    }

    public void setResult(ResultDAO result) {
        this.result = result;
    }

    public OffersImportResponseDAO getData() {
        return data;
    }

    public void setData(OffersImportResponseDAO data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultModelOfOffersImportResponse {\n");

        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

