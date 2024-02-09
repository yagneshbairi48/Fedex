package com.example.fedexdemo1.beans;

public class DeclaredValue {
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double amount) {
        this.value = amount;
    }

    private String currency;
    private Double value;
}
