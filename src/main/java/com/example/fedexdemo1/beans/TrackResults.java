package com.example.fedexdemo1.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrackResults {
    private TrackingNumberInfo trackingNumberInfo;
    private AdditionalTrackingInfo additionalTrackingInfo;
    private DistanceToDestination distanceToDestination;
    private ConsolidationDetail[] consolidationDetail;
    private String meterNumber;
    private ReturnDetail returnDetail;
    private ServiceDetail serviceDetail;
    private DestinationLocation destinationLocation;
    private LatestStatusDetail latestStatusDetail;
    private ServiceCommitMessage serviceCommitMessage;
    @JsonProperty("informationNotes")
    private InformationNotes[] informationNotes;
    private Error error;
    @JsonProperty("specialHandlings")
    private SpecialHandlings[] specialHandlings;
    @JsonProperty("availableImages")
    private AvailableImages[] availableImages;
    private DeliveryDetails deliveryDetails;
    private ScanEvents[] scanEvents;
    @JsonProperty("dateAndTimes")
    private DateAndTimes[] dateAndTimes;
    private PackageDetails packageDetails;
    private String goodsClassificationCode;
    private HoldAtLocation holdAtLocation;
    private CustomDeliveryOptions[] customDeliveryOptions;
    private EstimatedDeliveryTimeWindow estimatedDeliveryTimeWindow;
    @JsonProperty("pieceCounts")
    private PieceCounts[] pieceCounts;
    private OriginLocation originLocation;
    private RecipientInformation recipientInformation;
    private StandardTransitTimeWindow standardTransitTimeWindow;
    private ShipmentDetails shipmentDetails;
    private ReasonDetail reasonDetail;
    private String[] availableNotifications;
    private ShipperInformation shipperInformation;
    private LastUpdatedDestinationAddress lastUpdatedDestinationAddress;


    public TrackingNumberInfo getTrackingNumberInfo() {
        return trackingNumberInfo;
    }

    public void setTrackingNumberInfo(TrackingNumberInfo trackingNumberInfo) {
        this.trackingNumberInfo = trackingNumberInfo;
    }

    public AdditionalTrackingInfo getAdditionalTrackingInfo() {
        return additionalTrackingInfo;
    }

    public void setAdditionalTrackingInfo(AdditionalTrackingInfo additionalTrackingInfo) {
        this.additionalTrackingInfo = additionalTrackingInfo;
    }

    public DistanceToDestination getDistanceToDestination() {
        return distanceToDestination;
    }

    public void setDistanceToDestination(DistanceToDestination distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }

    public ConsolidationDetail[] getConsolidationDetail() {
        return consolidationDetail;
    }

    public void setConsolidationDetail(ConsolidationDetail[] consolidationDetail) {
        this.consolidationDetail = consolidationDetail;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public void setMeterNumber(String meterNumber) {
        this.meterNumber = meterNumber;
    }

    public ReturnDetail getReturnDetail() {
        return returnDetail;
    }

    public void setReturnDetail(ReturnDetail returnDetail) {
        this.returnDetail = returnDetail;
    }

    public ServiceDetail getServiceDetail() {
        return serviceDetail;
    }

    public void setServiceDetail(ServiceDetail serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    public DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(DestinationLocation destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public LatestStatusDetail getLatestStatusDetail() {
        return latestStatusDetail;
    }

    public void setLatestStatusDetail(LatestStatusDetail latestStatusDetail) {
        this.latestStatusDetail = latestStatusDetail;
    }

    public ServiceCommitMessage getServiceCommitMessage() {
        return serviceCommitMessage;
    }

    public void setServiceCommitMessage(ServiceCommitMessage serviceCommitMessage) {
        this.serviceCommitMessage = serviceCommitMessage;
    }

    public InformationNotes[] getInformationNotes() {
        return informationNotes;
    }

    public void setInformationNotes(InformationNotes[] informationNotes) {
        this.informationNotes = informationNotes;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public SpecialHandlings[] getSpecialHandlings() {
        return specialHandlings;
    }

    public void setSpecialHandlings(SpecialHandlings[] specialHandlings) {
        this.specialHandlings = specialHandlings;
    }

    public AvailableImages[] getAvailableImages() {
        return availableImages;
    }

    public void setAvailableImages(AvailableImages[] availableImages) {
        this.availableImages = availableImages;
    }

    public DeliveryDetails getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(DeliveryDetails deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    public ScanEvents[] getScanEvents() {
        return scanEvents;
    }

    public void setScanEvents(ScanEvents[] scanEvents) {
        this.scanEvents = scanEvents;
    }

    public DateAndTimes[] getDateAndTimes() {
        return dateAndTimes;
    }

    public void setDateAndTimes(DateAndTimes[] dateAndTimes) {
        this.dateAndTimes = dateAndTimes;
    }

    public PackageDetails getPackageDetails() {
        return packageDetails;
    }

    public void setPackageDetails(PackageDetails packageDetails) {
        this.packageDetails = packageDetails;
    }

    public String getGoodsClassificationCode() {
        return goodsClassificationCode;
    }

    public void setGoodsClassificationCode(String goodsClassificationCode) {
        this.goodsClassificationCode = goodsClassificationCode;
    }

    public HoldAtLocation getHoldAtLocation() {
        return holdAtLocation;
    }

    public void setHoldAtLocation(HoldAtLocation holdAtLocation) {
        this.holdAtLocation = holdAtLocation;
    }

    public CustomDeliveryOptions[] getCustomDeliveryOptions() {
        return customDeliveryOptions;
    }

    public void setCustomDeliveryOptions(CustomDeliveryOptions[] customDeliveryOptions) {
        this.customDeliveryOptions = customDeliveryOptions;
    }

    public EstimatedDeliveryTimeWindow getEstimatedDeliveryTimeWindow() {
        return estimatedDeliveryTimeWindow;
    }

    public void setEstimatedDeliveryTimeWindow(EstimatedDeliveryTimeWindow estimatedDeliveryTimeWindow) {
        this.estimatedDeliveryTimeWindow = estimatedDeliveryTimeWindow;
    }

    public PieceCounts[] getPieceCounts() {
        return pieceCounts;
    }

    public void setPieceCounts(PieceCounts[] pieceCounts) {
        this.pieceCounts = pieceCounts;
    }

    public OriginLocation getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(OriginLocation originLocation) {
        this.originLocation = originLocation;
    }

    public RecipientInformation getRecipientInformation() {
        return recipientInformation;
    }

    public void setRecipientInformation(RecipientInformation recipientInformation) {
        this.recipientInformation = recipientInformation;
    }

    public StandardTransitTimeWindow getStandardTransitTimeWindow() {
        return standardTransitTimeWindow;
    }

    public void setStandardTransitTimeWindow(StandardTransitTimeWindow standardTransitTimeWindow) {
        this.standardTransitTimeWindow = standardTransitTimeWindow;
    }

    public ShipmentDetails getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(ShipmentDetails shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public ReasonDetail getReasonDetail() {
        return reasonDetail;
    }

    public void setReasonDetail(ReasonDetail reasonDetail) {
        this.reasonDetail = reasonDetail;
    }

    public String[] getAvailableNotifications() {
        return availableNotifications;
    }

    public void setAvailableNotifications(String[] availableNotifications) {
        this.availableNotifications = availableNotifications;
    }

    public ShipperInformation getShipperInformation() {
        return shipperInformation;
    }

    public void setShipperInformation(ShipperInformation shipperInformation) {
        this.shipperInformation = shipperInformation;
    }

    public LastUpdatedDestinationAddress getLastUpdatedDestinationAddress() {
        return lastUpdatedDestinationAddress;
    }

    public void setLastUpdatedDestinationAddress(LastUpdatedDestinationAddress lastUpdatedDestinationAddress) {
        this.lastUpdatedDestinationAddress = lastUpdatedDestinationAddress;
    }
}
