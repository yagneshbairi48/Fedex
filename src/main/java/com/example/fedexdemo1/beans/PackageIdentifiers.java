package com.example.fedexdemo1.beans;

public class PackageIdentifiers {
    private String type;
    private String[] values ;
    private String trackingNumberUniqueId;
    private String carrierCode;

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] value) {
        this.values = values;
    }

    public String getTrackingNumberUniqueId() {
        return trackingNumberUniqueId;
    }

    public void setTrackingNumberUniqueId(String trackingNumberUniqueId) {
        this.trackingNumberUniqueId = trackingNumberUniqueId;
    }
}
