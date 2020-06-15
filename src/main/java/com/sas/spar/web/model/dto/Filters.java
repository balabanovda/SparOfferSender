package com.sas.spar.web.model.dto;

public class Filters
{
    private String $type;

    private String operator;

    private int firstValue;

    private String name;

    public void set$type(String $type){
        this.$type = $type;
    }
    public String get$type(){
        return this.$type;
    }
    public void setOperator(String operator){
        this.operator = operator;
    }
    public String getOperator(){
        return this.operator;
    }
    public void setFirstValue(int firstValue){
        this.firstValue = firstValue;
    }
    public int getFirstValue(){
        return this.firstValue;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Filters{" +
                "$type='" + $type + '\'' +
                ", operator='" + operator + '\'' +
                ", firstValue=" + firstValue +
                ", name='" + name + '\'' +
                '}';
    }
}