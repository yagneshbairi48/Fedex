package com.example.fedexdemo1.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryDetails {
    private String receivedByName;
    private String destinationServiceArea;
    private String destinationServiceAreaDescription;
    private String locationDescription;
    private ActualDeliveryAddress actualDeliveryAddress;
    private boolean deliveryToday;
    private String locationType;
    private String officeOrderDeliveryMethod;



    private String signedByName;
    private String deliveryAttempts;
    @JsonProperty("deliveryOptionEligibilityDetails")
    private DeliveryOptionEligibilityDetails[] deliveryOptionEligibilityDetails;

    public String getSignedByName() {
        return signedByName;
    }

    public void setSignedByName(String signedByName) {
        this.signedByName = signedByName;
    }
    public String getReceivedByName() {
        return receivedByName;
    }

    public void setReceivedByName(String receivedByName) {
        this.receivedByName = receivedByName;
    }

    public String getDestinationServiceArea() {
        return destinationServiceArea;
    }

    public void setDestinationServiceArea(String destinationServiceArea) {
        this.destinationServiceArea = destinationServiceArea;
    }

    public String getDestinationServiceAreaDescription() {
        return destinationServiceAreaDescription;
    }

    public void setDestinationServiceAreaDescription(String destinationServiceAreaDescription) {
        this.destinationServiceAreaDescription = destinationServiceAreaDescription;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setV(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public ActualDeliveryAddress getActualDeliveryAddress() {
        return actualDeliveryAddress;
    }

    public void setActualDeliveryAddress(ActualDeliveryAddress actualDeliveryAddress) {
        this.actualDeliveryAddress = actualDeliveryAddress;
    }

    public boolean isDeliveryToday() {
        return deliveryToday;
    }

    public void setDeliveryToday(boolean deliveryToday) {
        this.deliveryToday = deliveryToday;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getOfficeOrderDeliveryMethod() {
        return officeOrderDeliveryMethod;
    }

    public void setOfficeOrderDeliveryMethod(String officeOrderDeliveryMethod) {
        this.officeOrderDeliveryMethod = officeOrderDeliveryMethod;
    }

    public String getDeliveryAttempts() {
        return deliveryAttempts;
    }

    public void setDeliveryAttempts(String deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
    }

    public DeliveryOptionEligibilityDetails[] getDeliveryOptionEligibilityDetails() {
        return deliveryOptionEligibilityDetails;
    }

    public void setDeliveryOptionEligibilityDetails(DeliveryOptionEligibilityDetails[] deliveryOptionEligibilityDetails) {
        this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
    }


}
