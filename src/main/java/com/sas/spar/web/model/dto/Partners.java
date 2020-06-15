package com.sas.spar.web.model.dto;

import java.util.ArrayList;
import java.util.List;
public class Partners
{
    private List<Partner> partner;

    public List<Partner> getPartner() {
        return partner;
    }

    public void setPartner(List<Partner> partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "Partners{" +
                "partner=" + partner +
                '}';
    }
}