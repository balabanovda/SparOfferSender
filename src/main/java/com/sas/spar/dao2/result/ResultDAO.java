package com.sas.spar.dao2.result;


import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "result_loymax_Result", schema = "exchange", catalog = "DDS")
public class ResultDAO {
    @Id
    @Column(name = "Result_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Result_id_generator")
    @SequenceGenerator(name = "Result_id_generator", sequenceName = "Result_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;

    public enum StateEnum {
        SUCCESS("Success"),

        FAIL("Fail"),

        ERROR("Error"),

        VALIDATIONERROR("ValidationError");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @Enumerated(EnumType.STRING)
    private StateEnum state = null;
    private String message = null;

    private String messageCode = null;
    @OneToMany(mappedBy = "resultDAO", cascade = { CascadeType.ALL })
    private List<ValidationErrorDAO> validationErrors = null;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ResultModelOfOffersImportResponse_id", referencedColumnName = "ResultModelOfOffersImportResponse_id")
    private ResultModelOfOffersImportResponseDAO resultModelOfOffersImportResponseDAO;
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public List<ValidationErrorDAO> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(List<ValidationErrorDAO> validationErrors) {
        this.validationErrors = validationErrors;
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
        sb.append("class Result {\n");

        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
        sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

