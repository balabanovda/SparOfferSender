package com.sas.spar.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Response<T> {

    private Meta meta;
    public T dataBlock;
}
