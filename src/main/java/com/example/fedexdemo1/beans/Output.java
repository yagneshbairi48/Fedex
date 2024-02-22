package com.example.fedexdemo1.beans;

public class Output {


    private CompleteTrackResults[] completeTrackResults;
    private String alerts;

    private TransitTimes[] transitTimes;

    public TransitTimes[] getTransitTimes() {
        return transitTimes;
    }

    public void setTransitTimes(TransitTimes[] transitTimes) {
        this.transitTimes = transitTimes;
    }

    public boolean getEncoded() {
        return encoded;
    }

    public void setEncoded(boolean encoded) {
        this.encoded = encoded;
    }

    private boolean encoded;

    public CompleteTrackResults[] getCompleteTrackResults() {
        return completeTrackResults;
    }

    public void setCompleteTrackResults(CompleteTrackResults[] completeTrackResults) {
        this.completeTrackResults = completeTrackResults;
    }

    public String getAlerts() {
        return alerts;
    }

    public void setAlerts(String alerts) {
        this.alerts = alerts;
    }
}
