package com.example.fedexdemo1.beans;

public class DestinationLocation {
    private String locationId;

    private LocationContactAndAddress locationContactAndAddress ;
    private String locationType;

    private String geoPositionalCoordinates;

    public String getGeoPositionalCoordinates() {
        return geoPositionalCoordinates;
    }

    public void setGeoPositionalCoordinates(String geoPositionalCoordinates) {
        this.geoPositionalCoordinates = geoPositionalCoordinates;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public LocationContactAndAddress getLocationContactAndAddress() {
        return locationContactAndAddress;
    }

    public void setLocationContactAndAddress(LocationContactAndAddress locationContactAndAddress) {
        this.locationContactAndAddress = locationContactAndAddress;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
}
