package com.example.fedexdemo1.beans;

public class CustomDeliveryOptions {
    public RequestedAppointmentDetail getRequestedAppointmentDetail() {
        return requestedAppointmentDetail;
    }

    public void setRequestedAppointmentDetail(RequestedAppointmentDetail requestedAppointmentDetail) {
        this.requestedAppointmentDetail = requestedAppointmentDetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private RequestedAppointmentDetail requestedAppointmentDetail;
    private String description;
    private String type;
    private String status;
}
