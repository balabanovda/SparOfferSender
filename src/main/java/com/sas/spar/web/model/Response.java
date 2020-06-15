package com.sas.spar.web.model;



public class Response<T> {

    private Meta meta;
    public T dataBlock;

    public Response(Meta meta, T dataBlock) {
        this.meta = meta;
        this.dataBlock = dataBlock;
    }
}
