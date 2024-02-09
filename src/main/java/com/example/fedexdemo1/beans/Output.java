package com.example.fedexdemo1.beans;

public class Output {


    private CompleteTrackResults[] completeTrackResults;
    private String alerts;

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
