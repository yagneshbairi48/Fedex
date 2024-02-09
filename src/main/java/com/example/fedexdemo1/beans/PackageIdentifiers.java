package com.example.fedexdemo1.beans;

public class PackageIdentifiers {
    private String type;
    private String value ;
    private String trackingNumberUniqueId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTrackingNumberUniqueId() {
        return trackingNumberUniqueId;
    }

    public void setTrackingNumberUniqueId(String trackingNumberUniqueId) {
        this.trackingNumberUniqueId = trackingNumberUniqueId;
    }
}
