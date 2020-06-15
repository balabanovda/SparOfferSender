package com.sas.spar.web.model.dto;

import java.util.ArrayList;
import java.util.List;
public class Actions
{
    private String $type;

    private int percent;

    private boolean distributeToAll;

    private String discountType;

    private List<CalculationExclusionDiscountTypes> calculationExclusionDiscountTypes;

    private int order;

    public void set$type(String $type){
        this.$type = $type;
    }
    public String get$type(){
        return this.$type;
    }
    public void setPercent(int percent){
        this.percent = percent;
    }
    public int getPercent(){
        return this.percent;
    }
    public void setDistributeToAll(boolean distributeToAll){
        this.distributeToAll = distributeToAll;
    }
    public boolean getDistributeToAll(){
        return this.distributeToAll;
    }
    public void setDiscountType(String discountType){
        this.discountType = discountType;
    }
    public String getDiscountType(){
        return this.discountType;
    }

    public boolean isDistributeToAll() {
        return distributeToAll;
    }

    public List<CalculationExclusionDiscountTypes> getCalculationExclusionDiscountTypes() {
        return calculationExclusionDiscountTypes;
    }

    public void setCalculationExclusionDiscountTypes(List<CalculationExclusionDiscountTypes> calculationExclusionDiscountTypes) {
        this.calculationExclusionDiscountTypes = calculationExclusionDiscountTypes;
    }

    public void setOrder(int order){
        this.order = order;
    }
    public int getOrder(){
        return this.order;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "$type='" + $type + '\'' +
                ", percent=" + percent +
                ", distributeToAll=" + distributeToAll +
                ", discountType='" + discountType + '\'' +
                ", calculationExclusionDiscountTypes=" + calculationExclusionDiscountTypes +
                ", order=" + order +
                '}';
    }
}