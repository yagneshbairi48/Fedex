package com.example.fedexdemo1.beans;

public class Address {
    private String addressClassification;
    private Boolean residential;
    private String[] streetLines;
    private String city;
    private String urbanizationCode;
    private String stateOrProvinceCode;
    private String postalCode;
    private String countryCode;
    private String countryName;

    public String getAddressClassification() {
        return addressClassification;
    }

    public void setAddressClassification(String addressClassification) {
        this.addressClassification = addressClassification;
    }

    public Boolean getResidential() {
        return residential;
    }

    public void setResidential(Boolean residential) {
        this.residential = residential;
    }

    public String[] getStreetLines() {
        return streetLines;
    }

    public void setStreetLines(String[] streetLines) {
        this.streetLines = streetLines;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUrbanizationCode() {
        return urbanizationCode;
    }

    public void setUrbanizationCode(String urbanizationCode) {
        this.urbanizationCode = urbanizationCode;
    }

    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
