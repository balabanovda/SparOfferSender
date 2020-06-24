package com.sas.spar.web.model.dto;

public class Partner {
    private String id;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "Partner{" +
                "id='" + id + '\'' +
                '}';
    }
}
