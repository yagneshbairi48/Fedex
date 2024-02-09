package com.example.fedexdemo1.beans;

public class ReturnDetail {
    private String authorizationName;
    private ReasonDetail[] reasonDetail;

    public String getAuthorizationName() {
        return authorizationName;
    }

    public void setAuthorizationName(String authorizationName) {
        this.authorizationName = authorizationName;
    }

    public ReasonDetail[] getReasonDetail() {
        return reasonDetail;
    }

    public void setReasonDetail(ReasonDetail[] reasonDetail) {
        this.reasonDetail = reasonDetail;
    }
}
