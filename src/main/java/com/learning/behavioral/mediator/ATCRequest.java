package com.learning.behavioral.mediator;

public class ATCRequest {
    private String requestType;
    private String requestDetails;

    public ATCRequest(String requestType, String requestDetails) {
        this.requestType = requestType;
        this.requestDetails = requestDetails;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getRequestDetails() {
        return requestDetails;
    }
}
