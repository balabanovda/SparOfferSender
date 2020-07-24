package com.sas.spar.dao2;



import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import restclient.model.AttributeDiscountDto;
import restclient.model.DirectDiscountActionDto;

import javax.persistence.*;
import java.util.List;

@Entity
public class DirectDiscountActionDAO extends ActionDAO {
@Column(name = "\"percent\"")
    private Double percent = null;

    private Double amountPerUnit = null;

    private Double amountPerUniqueSku = null;

    private Double pricePerUnit = null;

    private Double amount = null;

    private Double amountMeasure = null;

    private Double amountPerMeasure = null;

    private Double amountWeight = null;

    private Double amountPerWeight = null;

    private Double price = null;


    private Boolean distributeToAll = null;

    public Boolean getDistributeToAll() {
        return distributeToAll;
    }

    public enum DiscountTypeEnum { PERCENT("Percent"),

        AMOUNT("Amount"),

        PRICEPERUNIT("PricePerUnit"),

        AMOUNTPERUNIT("AmountPerUnit"),

        AMOUNTPERMEASURE("AmountPerMeasure"),

        PRICE("Price"),

        AMOUNTPERUNIQUESKU("AmountPerUniqueSku"),

        AMOUNTPERWEIGHT("AmountPerWeight");

        private String value;

        DiscountTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DiscountTypeEnum fromValue(String text) {
            for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @Enumerated(EnumType.STRING)
    private DiscountTypeEnum discountType = null;

    public enum CalculationExclusionDiscountTypesEnum {
        DISCOUNT("Discount"),

        PAYMENTLOYMAXBONUS("PaymentLoymaxBonus"),

        PAYMENTEXTERNALBONUS("PaymentExternalBonus");

        private String value;

        CalculationExclusionDiscountTypesEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
    @ElementCollection
    @CollectionTable(schema = "exchange", catalog = "DDS",name = "loymax_CalculationExclusionDiscountTypesEnum", joinColumns = @JoinColumn(table = "loymax_Action",name = "Action_id"))
    @Enumerated(EnumType.STRING)
    private List<CalculationExclusionDiscountTypesEnum> calculationExclusionDiscountTypes = null;

    private Integer order = null;

    private String id = null;

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }


    public Double getAmountPerUnit() {
        return amountPerUnit;
    }

    public void setAmountPerUnit(Double amountPerUnit) {
        this.amountPerUnit = amountPerUnit;
    }

    public Double getAmountPerUniqueSku() {
        return amountPerUniqueSku;
    }

    public void setAmountPerUniqueSku(Double amountPerUniqueSku) {
        this.amountPerUniqueSku = amountPerUniqueSku;
    }


    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmountMeasure() {
        return amountMeasure;
    }

    public void setAmountMeasure(Double amountMeasure) {
        this.amountMeasure = amountMeasure;
    }


    public Double getAmountPerMeasure() {
        return amountPerMeasure;
    }

    public void setAmountPerMeasure(Double amountPerMeasure) {
        this.amountPerMeasure = amountPerMeasure;
    }


    public Double getAmountWeight() {
        return amountWeight;
    }

    public void setAmountWeight(Double amountWeight) {
        this.amountWeight = amountWeight;
    }

    public Double getAmountPerWeight() {
        return amountPerWeight;
    }

    public void setAmountPerWeight(Double amountPerWeight) {
        this.amountPerWeight = amountPerWeight;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

//    public AttributeDiscountDAO getAttributeDiscount() {
//        return attributeDiscount;
//    }
//
//    public void setAttributeDiscount(AttributeDiscountDAO attributeDiscount) {
//        this.attributeDiscount = attributeDiscount;
//    }

    public Boolean isDistributeToAll() {
        return distributeToAll;
    }

    public void setDistributeToAll(Boolean distributeToAll) {
        this.distributeToAll = distributeToAll;
    }

    public DiscountTypeEnum getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountTypeEnum discountType) {
        this.discountType = discountType;
    }


    public List<CalculationExclusionDiscountTypesEnum> getCalculationExclusionDiscountTypes() {
        return calculationExclusionDiscountTypes;
    }

    public void setCalculationExclusionDiscountTypes(List<CalculationExclusionDiscountTypesEnum> calculationExclusionDiscountTypes) {
        this.calculationExclusionDiscountTypes = calculationExclusionDiscountTypes;
    }
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectDiscountActionDto {\n");

        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
        sb.append("    amountPerUnit: ").append(toIndentedString(amountPerUnit)).append("\n");
        sb.append("    amountPerUniqueSku: ").append(toIndentedString(amountPerUniqueSku)).append("\n");
        sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    amountMeasure: ").append(toIndentedString(amountMeasure)).append("\n");
        sb.append("    amountPerMeasure: ").append(toIndentedString(amountPerMeasure)).append("\n");
        sb.append("    amountWeight: ").append(toIndentedString(amountWeight)).append("\n");
        sb.append("    amountPerWeight: ").append(toIndentedString(amountPerWeight)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
//        sb.append("    attributeDiscount: ").append(toIndentedString(attributeDiscount)).append("\n");
        sb.append("    distributeToAll: ").append(toIndentedString(distributeToAll)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
        sb.append("    calculationExclusionDiscountTypes: ").append(toIndentedString(calculationExclusionDiscountTypes)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


