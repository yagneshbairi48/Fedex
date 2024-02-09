package com.example.fedexdemo1.beans;

public class ScanEvents {
    private String date;
    private String derivedStatus;
    private ScanLocation scanLocation;
    private String locationId;
    private String locationType;
    private String exceptionDescription;
    private String eventDescription;
    private String eventType;
    private String derivedStatusCode;
    private String exceptionCode;
    private DelayDetail delayDetail;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDerivedStatus() {
        return derivedStatus;
    }

    public void setDerivedStatus(String derivedStatus) {
        this.derivedStatus = derivedStatus;
    }

    public ScanLocation getScanLocation() {
        return scanLocation;
    }

    public void setScanLocation(ScanLocation scanLocation) {
        this.scanLocation = scanLocation;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getExceptionDescription() {
        return exceptionDescription;
    }

    public void setExceptionDescription(String exceptionDescription) {
        this.exceptionDescription = exceptionDescription;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDerivedStatusCode() {
        return derivedStatusCode;
    }

    public void setDerivedStatusCode(String derivedStatusCode) {
        this.derivedStatusCode = derivedStatusCode;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public DelayDetail getDelayDetail() {
        return delayDetail;
    }

    public void setDelayDetail(DelayDetail delayDetail) {
        this.delayDetail = delayDetail;
    }
}
