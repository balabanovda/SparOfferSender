package com.sas.spar.web.model.dto;
import java.util.ArrayList;
import java.util.List;
public class Root
{
    private List<Offers> offers;

    private String version;

    public void setOffers(List<Offers> offers){
        this.offers = offers;
    }
    public List<Offers> getOffers(){
        return this.offers;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public String getVersion(){
        return this.version;
    }

    @Override
    public String toString() {
        return "Root{" +
                "offers=" + offers +
                ", version='" + version + '\'' +
                '}';
    }
}