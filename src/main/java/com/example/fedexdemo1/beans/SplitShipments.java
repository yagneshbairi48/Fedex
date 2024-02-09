package com.example.fedexdemo1.beans;

public class SplitShipments {
    private String pieceCount;
    private String statusDescription;
    private String timestamp;
    private String statusCode;

    public String getPieceCount() {
        return pieceCount;
    }

    public void setPieceCount(String pieceCount) {
        this.pieceCount = pieceCount;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
