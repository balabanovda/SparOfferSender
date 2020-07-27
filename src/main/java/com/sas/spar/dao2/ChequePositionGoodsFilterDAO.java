package com.sas.spar.dao2;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loymax_ChequePositionGoodsFilter", schema = "exchange", catalog = "DDS")
public class ChequePositionGoodsFilterDAO extends FilterDAO {
    public enum TypeEnum {
        ONLYGOODS("OnlyGoods"),

        GOODSQUANTITY("GoodsQuantity"),

        GOODSAMOUNT("GoodsAmount");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @Enumerated(EnumType.STRING)
    private TypeEnum typeEnum = null;

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
    @OneToMany(mappedBy = "chequePositionGoodsFilterDAO", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private List<BaseGoodsGroupDAO> goodsGroups = null;

    private String personalOfferAttributeLogicalName = null;

    private String name = null;

    private Boolean dividePositions = null;

    public enum ChequeGoodsSortTypeEnum {
        POSITIONASCENDING("PositionAscending"),

        POSITIONDESCENDING("PositionDescending"),

        PRICEASCENDING("PriceAscending"),

        PRICEDESCENDING("PriceDescending");

        private String value;

        ChequeGoodsSortTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ChequeGoodsSortTypeEnum fromValue(String text) {
            for (ChequeGoodsSortTypeEnum b : ChequeGoodsSortTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @Enumerated(EnumType.STRING)
    private ChequeGoodsSortTypeEnum chequeGoodsSortType = null;

    public TypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(TypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
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

    public List<BaseGoodsGroupDAO> getGoodsGroups() {
        return goodsGroups;
    }

    public void setGoodsGroups(List<BaseGoodsGroupDAO> goodsGroups) {
        this.goodsGroups = goodsGroups;
    }

    public String getPersonalOfferAttributeLogicalName() {
        return personalOfferAttributeLogicalName;
    }

    public void setPersonalOfferAttributeLogicalName(String personalOfferAttributeLogicalName) {
        this.personalOfferAttributeLogicalName = personalOfferAttributeLogicalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isDividePositions() {
        return dividePositions;
    }

    public void setDividePositions(Boolean dividePositions) {
        this.dividePositions = dividePositions;
    }

    public ChequeGoodsSortTypeEnum getChequeGoodsSortType() {
        return chequeGoodsSortType;
    }

    public void setChequeGoodsSortType(ChequeGoodsSortTypeEnum chequeGoodsSortType) {
        this.chequeGoodsSortType = chequeGoodsSortType;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChequePositionGoodsFilterDto {\n");

        sb.append("    type: ").append(toIndentedString(typeEnum)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    firstValue: ").append(toIndentedString(firstValue)).append("\n");
        sb.append("    secondValue: ").append(toIndentedString(secondValue)).append("\n");
        sb.append("    goodsGroups: ").append(toIndentedString(goodsGroups)).append("\n");
        sb.append("    personalOfferAttributeLogicalName: ").append(toIndentedString(personalOfferAttributeLogicalName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dividePositions: ").append(toIndentedString(dividePositions)).append("\n");
        sb.append("    chequeGoodsSortType: ").append(toIndentedString(chequeGoodsSortType)).append("\n");
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


