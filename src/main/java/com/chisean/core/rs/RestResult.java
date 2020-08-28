package com.chisean.core.rs;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
public class RestResult<T> implements Serializable {
    int code;
    String errmsg;
    T data;


    public static RestResult ok() {
        RestResult res = new RestResult();
        res.code=200;
        return  res;
    }
}
