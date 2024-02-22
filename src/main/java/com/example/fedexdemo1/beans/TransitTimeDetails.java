package com.example.fedexdemo1.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransitTimeDetails {
    private String serviceType;
    @JsonProperty("customerMessages")
    private CustomerMessages[] customerMessages;

    private Distance distance;
    private Commit commit;
    private DestinationLocation destinationLocation;

    private String serviceName;

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public CustomerMessages[] getCustomerMessages() {
        return customerMessages;
    }

    public void setCustomerMessages(CustomerMessages[] customerMessages) {
        this.customerMessages = customerMessages;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(DestinationLocation destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
