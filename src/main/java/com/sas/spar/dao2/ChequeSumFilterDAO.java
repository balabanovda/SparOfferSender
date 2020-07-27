package com.sas.spar.dao2;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "loymax_ChequeSumFilter", schema = "exchange", catalog = "DDS")
public class ChequeSumFilterDAO extends FilterDAO {

    public enum OperatorEnum {
        MORE("More"),

        LESS("Less"),

        EQUALS("Equals"),

        BETWEEN("Between"),

        MOREOREQUAL("MoreOrEqual"),

        LESSOREQUAL("LessOrEqual"),

        BETWEENLESSEQUAL("BetweenLessEqual"),

        BETWEENMOREEQUAL("BetweenMoreEqual"),

        BETWEENEQUAL("BetweenEqual"),

        EACH("Each");

        private String value;

        OperatorEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OperatorEnum fromValue(String text) {
            for (OperatorEnum b : OperatorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @Enumerated(EnumType.STRING)
    private OperatorEnum operator = null;

    private Double firstValue = null;

    private Double secondValue = null;

    private String name = null;

    public  OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator( OperatorEnum operator) {
        this.operator = operator;
    }

    public Double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Double firstValue) {
        this.firstValue = firstValue;
    }

    public Double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Double secondValue) {
        this.secondValue = secondValue;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChequeSumFilterDto {\n");

        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    firstValue: ").append(toIndentedString(firstValue)).append("\n");
        sb.append("    secondValue: ").append(toIndentedString(secondValue)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

