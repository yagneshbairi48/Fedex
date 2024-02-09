package com.example.fedexdemo1.beans;

public class CompleteTrackResults {

    private String trackingNumber;
    private TrackResults[] trackResults;
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public TrackResults[] getTrackResults() {
        return trackResults;
    }

    public void setTrackResults(TrackResults[] trackResults) {
        this.trackResults = trackResults;
    }


}
