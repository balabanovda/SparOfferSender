package com.sas.spar.web.model;



public class Response<T> {

    private Meta meta;
    public T dataBlock;

    public Response(Meta meta, T dataBlock) {
        this.meta = meta;
        this.dataBlock = dataBlock;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public T getDataBlock() {
        return dataBlock;
    }

    public void setDataBlock(T dataBlock) {
        this.dataBlock = dataBlock;
    }
}
