package com.sas.spar.web.model.dto;


import java.util.ArrayList;
import java.util.List;
public class Chains
{
    private List<Filters> filters;

    private List<Actions> actions;

    private int order;

    private String name;

    public void setFilters(List<Filters> filters){
        this.filters = filters;
    }
    public List<Filters> getFilters(){
        return this.filters;
    }
    public void setActions(List<Actions> actions){
        this.actions = actions;
    }
    public List<Actions> getActions(){
        return this.actions;
    }
    public void setOrder(int order){
        this.order = order;
    }
    public int getOrder(){
        return this.order;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Chains{" +
                "filters=" + filters +
                ", actions=" + actions +
                ", order=" + order +
                ", name='" + name + '\'' +
                '}';
    }
}
