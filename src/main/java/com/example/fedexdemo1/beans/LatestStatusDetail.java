package com.example.fedexdemo1.beans;

public class LatestStatusDetail {
    private ScanLocation scanLocation;
    private String code;
    private String derivedCode;
    private AncillaryDetails[] ancillaryDetails;
    private String statusByLocale;
    private String description;
    private DelayDetail delayDetail;

    public ScanLocation getScanLocation() {
        return scanLocation;
    }

    public void setScanLocation(ScanLocation scanLocation) {
        this.scanLocation = scanLocation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDerivedCode() {
        return derivedCode;
    }

    public void setDerivedCode(String derivedCode) {
        this.derivedCode = derivedCode;
    }

    public AncillaryDetails[] getAncillaryDetails() {
        return ancillaryDetails;
    }

    public void setAncillaryDetails(AncillaryDetails[] ancillaryDetails) {
        this.ancillaryDetails = ancillaryDetails;
    }

    public String getStatusByLocale() {
        return statusByLocale;
    }

    public void setStatusByLocale(String statusByLocale) {
        this.statusByLocale = statusByLocale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DelayDetail getDelayDetail() {
        return delayDetail;
    }

    public void setDelayDetail(DelayDetail delayDetail) {
        this.delayDetail = delayDetail;
    }
}
