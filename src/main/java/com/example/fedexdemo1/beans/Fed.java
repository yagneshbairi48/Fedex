package com.example.fedexdemo1.beans;

public class    Fed {
    public String transactionId;
    public String customerTransactionId;
    public Output output;
    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustomerTransactionId() {
        return customerTransactionId;
    }

    public void setCustomerTransactionId(String customerTransactionId) {
        this.customerTransactionId = customerTransactionId;
    }


}
