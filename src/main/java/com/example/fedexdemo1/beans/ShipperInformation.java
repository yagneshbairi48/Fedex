package com.example.fedexdemo1.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class ShipperInformation {
    private Contact contact;
    private Address address;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
