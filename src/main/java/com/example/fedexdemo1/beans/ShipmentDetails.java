package com.example.fedexdemo1.beans;

public class ShipmentDetails {
    private Contents[] contents;
    private Boolean beforePossessionStatus;
    private Weight[] weight;
    private String contentPieceCount;
    private SplitShipments[] splitShipments;

    public Contents[] getContents() {
        return contents;
    }

    public void setContents(Contents[] contents) {
        this.contents = contents;
    }

    public Boolean getBeforePossessionStatus() {
        return beforePossessionStatus;
    }

    public void setBeforePossessionStatus(Boolean beforePossessionStatus) {
        this.beforePossessionStatus = beforePossessionStatus;
    }

    public Weight[] getWeight() {
        return weight;
    }

    public void setWeight(Weight[] weight) {
        this.weight = weight;
    }

    public String getContentPieceCount() {
        return contentPieceCount;
    }

    public void setContentPieceCount(String contentPieceCount) {
        this.contentPieceCount = contentPieceCount;
    }

    public SplitShipments[] getSplitShipments() {
        return splitShipments;
    }

    public void setSplitShipments(SplitShipments[] splitShipments) {
        this.splitShipments = splitShipments;
    }
}
