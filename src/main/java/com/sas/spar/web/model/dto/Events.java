package com.sas.spar.web.model.dto;

import java.util.ArrayList;
import java.util.List;
public class Events
{
    private String $type;

    private List<Chains> chains;

    public void set$type(String $type){
        this.$type = $type;
    }
    public String get$type(){
        return this.$type;
    }
    public void setChains(List<Chains> chains){
        this.chains = chains;
    }
    public List<Chains> getChains(){
        return this.chains;
    }

    @Override
    public String toString() {
        return "Events{" +
                "$type='" + $type + '\'' +
                ", chains=" + chains +
                '}';
    }
}