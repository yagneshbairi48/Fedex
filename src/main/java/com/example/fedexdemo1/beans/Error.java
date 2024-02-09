package com.example.fedexdemo1.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Parameter;

public class Error {
    private String code;
    @JsonProperty("parameterList")
    private ParameterList[] parameterList;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ParameterList[] getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList[] parameterList) {
        this.parameterList = parameterList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
