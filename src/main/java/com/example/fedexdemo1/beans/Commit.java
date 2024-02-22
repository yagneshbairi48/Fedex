package com.example.fedexdemo1.beans;

public class Commit {
    private String brokerCommitTimestamp;
    private String cutOffTime;
    private String commodityName;

    private TransitDays transitDays;

    private String commitMessageDetails;

    private DerivedDestinationDetail derivedDestinationDetail;

    private DateDetail dateDetail;

    public String getBrokerCommitTimestamp() {
        return brokerCommitTimestamp;
    }

    public void setBrokerCommitTimestamp(String brokerCommitTimestamp) {
        this.brokerCommitTimestamp = brokerCommitTimestamp;
    }

    public String getCutOffTime() {
        return cutOffTime;
    }

    public void setCutOffTime(String cutOffTime) {
        this.cutOffTime = cutOffTime;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public TransitDays getTransitDays() {
        return transitDays;
    }

    public void setTransitDays(TransitDays transitDays) {
        this.transitDays = transitDays;
    }

    public String getCommitMessageDetails() {
        return commitMessageDetails;
    }

    public void setCommitMessageDetails(String commitMessageDetails) {
        this.commitMessageDetails = commitMessageDetails;
    }

    public DerivedDestinationDetail getDerivedDestinationDetail() {
        return derivedDestinationDetail;
    }

    public void setDerivedDestinationDetail(DerivedDestinationDetail derivedDestinationDetail) {
        this.derivedDestinationDetail = derivedDestinationDetail;
    }

    public DateDetail getDateDetail() {
        return dateDetail;
    }

    public void setDateDetail(DateDetail dateDetail) {
        this.dateDetail = dateDetail;
    }
}
