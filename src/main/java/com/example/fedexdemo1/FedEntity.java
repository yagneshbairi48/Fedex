package com.example.fedexdemo1;

import com.example.fedexdemo1.beans.Contact;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
public class FedEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "transactionid")
    private String transactionId  ;
    @Column(name = "customertransactionid")
    private String customerTransactionId  ;

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

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getTrackingNumberUniqueId() {
        return trackingNumberUniqueId;
    }

    public void setTrackingNumberUniqueId(String trackingNumberUniqueId) {
        this.trackingNumberUniqueId = trackingNumberUniqueId;
    }

    public boolean isHasAssociatedShipments() {
        return hasAssociatedShipments;
    }

    public void setHasAssociatedShipments(boolean hasAssociatedShipments) {
        this.hasAssociatedShipments = hasAssociatedShipments;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getShipmentNotes() {
        return shipmentNotes;
    }

    public void setShipmentNotes(String shipmentNotes) {
        this.shipmentNotes = shipmentNotes;
    }



    public String getDistanceToDestinationUnits() {
        return distanceToDestinationUnits;
    }

    public void setDistanceToDestinationUnits(String distanceToDestinationUnits) {
        this.distanceToDestinationUnits = distanceToDestinationUnits;
    }

    public double getDistanceToDestinationValue() {
        return distanceToDestinationValue;
    }

    public void setDistanceToDestinationValue(double distanceToDestinationValue) {
        this.distanceToDestinationValue = distanceToDestinationValue;
    }

    public String getConsolidationDetailTimeStamp() {
        return consolidationDetailTimeStamp;
    }

    public void setConsolidationDetailTimeStamp(String consolidationDetailTimeStamp) {
        this.consolidationDetailTimeStamp = consolidationDetailTimeStamp;
    }

    public String getConsolidationID() {
        return consolidationID;
    }

    public void setConsolidationID(String consolidationID) {
        this.consolidationID = consolidationID;
    }

    public String getConsolidationreasonDetailDescription() {
        return consolidationreasonDetailDescription;
    }

    public void setConsolidationreasonDetailDescription(String consolidationreasonDetailDescription) {
        this.consolidationreasonDetailDescription = consolidationreasonDetailDescription;
    }

    public String getConsolidationreasonDetailType() {
        return consolidationreasonDetailType;
    }

    public void setConsolidationreasonDetailType(String consolidationreasonDetailType) {
        this.consolidationreasonDetailType = consolidationreasonDetailType;
    }

    public int getConsolidationPackageCount() {
        return consolidationPackageCount;
    }

    public void setConsolidationPackageCount(int consolidationPackageCount) {
        this.consolidationPackageCount = consolidationPackageCount;
    }

    public String getConsolidationEventType() {
        return consolidationEventType;
    }

    public void setConsolidationEventType(String consolidationEventType) {
        this.consolidationEventType = consolidationEventType;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public void setMeterNumber(String meterNumber) {
        this.meterNumber = meterNumber;
    }

    public String getReturnAuthorizationName() {
        return returnAuthorizationName;
    }

    public void setReturnAuthorizationName(String returnAuthorizationName) {
        this.returnAuthorizationName = returnAuthorizationName;
    }

    public String getReturnReasonDetailDescription() {
        return returnReasonDetailDescription;
    }

    public void setReturnReasonDetailDescription(String returnReasonDetailDescription) {
        this.returnReasonDetailDescription = returnReasonDetailDescription;
    }

    public String getReturnReasonDetailType() {
        return returnReasonDetailType;
    }

    public void setReturnReasonDetailType(String returnReasonDetailType) {
        this.returnReasonDetailType = returnReasonDetailType;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceShortDescription() {
        return serviceShortDescription;
    }

    public void setServiceShortDescription(String serviceShortDescription) {
        this.serviceShortDescription = serviceShortDescription;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getDestLocationId() {
        return destLocationId;
    }

    public void setDestLocationId(String destLocationId) {
        this.destLocationId = destLocationId;
    }

    public String getDestPersonName() {
        return destPersonName;
    }

    public void setDestPersonName(String destPersonName) {
        this.destPersonName = destPersonName;
    }

    public String getDestPhoneNumber() {
        return destPhoneNumber;
    }

    public void setDestPhoneNumber(String destPhoneNumber) {
        this.destPhoneNumber = destPhoneNumber;
    }

    public String getDestCompanyName() {
        return destCompanyName;
    }

    public void setDestCompanyName(String destCompanyName) {
        this.destCompanyName = destCompanyName;
    }

    public String getDestAddressClassification() {
        return destAddressClassification;
    }

    public void setDestAddressClassification(String destAddressClassification) {
        this.destAddressClassification = destAddressClassification;
    }

    public boolean isDestResidential() {
        return destResidential;
    }

    public void setDestResidential(boolean destResidential) {
        this.destResidential = destResidential;
    }

    public String getDestStreetLines() {
        return destStreetLines;
    }

    public void setDestStreetLines(String destStreetLines) {
        this.destStreetLines = destStreetLines;
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public String getDestUrbanizationCode() {
        return destUrbanizationCode;
    }

    public void setDestUrbanizationCode(String destUrbanizationCode) {
        this.destUrbanizationCode = destUrbanizationCode;
    }

    public String getDestStateOrProvinceCode() {
        return destStateOrProvinceCode;
    }

    public void setDestStateOrProvinceCode(String destStateOrProvinceCode) {
        this.destStateOrProvinceCode = destStateOrProvinceCode;
    }

    public String getDestPostalCode() {
        return destPostalCode;
    }

    public void setDestPostalCode(String destPostalCode) {
        this.destPostalCode = destPostalCode;
    }

    public String getDestCountryCode() {
        return destCountryCode;
    }

    public void setDestCountryCode(String destCountryCode) {
        this.destCountryCode = destCountryCode;
    }

    public String getDestCountryName() {
        return destCountryName;
    }

    public void setDestCountryName(String destCountryName) {
        this.destCountryName = destCountryName;
    }

    public String getDestLocationType() {
        return destLocationType;
    }

    public void setDestLocationType(String destLocationType) {
        this.destLocationType = destLocationType;
    }

    public String getLatestStatusAddressClassification() {
        return latestStatusAddressClassification;
    }

    public void setLatestStatusAddressClassification(String latestStatusAddressClassification) {
        this.latestStatusAddressClassification = latestStatusAddressClassification;
    }

    public boolean isLatestStatusResidential() {
        return latestStatusResidential;
    }

    public void setLatestStatusResidential(boolean latestStatusResidential) {
        this.latestStatusResidential = latestStatusResidential;
    }

    public String getLatestStatusStreetLines() {
        return latestStatusStreetLines;
    }

    public void setLatestStatusStreetLines(String latestStatusStreetLines) {
        this.latestStatusStreetLines = latestStatusStreetLines;
    }

    public String getLatestStatusCity() {
        return latestStatusCity;
    }

    public void setLatestStatusCity(String latestStatusCity) {
        this.latestStatusCity = latestStatusCity;
    }

    public String getLatestStatusUrbanizationCode() {
        return latestStatusUrbanizationCode;
    }

    public void setLatestStatusUrbanizationCode(String latestStatusUrbanizationCode) {
        this.latestStatusUrbanizationCode = latestStatusUrbanizationCode;
    }

    public String getLatestStatusStateOrProvinceCode() {
        return latestStatusStateOrProvinceCode;
    }

    public void setLatestStatusStateOrProvinceCode(String latestStatusStateOrProvinceCode) {
        this.latestStatusStateOrProvinceCode = latestStatusStateOrProvinceCode;
    }

    public String getLatestStatusPostalCode() {
        return latestStatusPostalCode;
    }

    public void setLatestStatusPostalCode(String latestStatusPostalCode) {
        this.latestStatusPostalCode = latestStatusPostalCode;
    }

    public String getLatestStatusCountryCode() {
        return latestStatusCountryCode;
    }

    public void setLatestStatusCountryCode(String latestStatusCountryCode) {
        this.latestStatusCountryCode = latestStatusCountryCode;
    }

    public String getLatestStatusCountryName() {
        return latestStatusCountryName;
    }

    public void setLatestStatusCountryName(String latestStatusCountryName) {
        this.latestStatusCountryName = latestStatusCountryName;
    }

    public String getLatestStatusCode() {
        return latestStatusCode;
    }

    public void setLatestStatusCode(String latestStatusCode) {
        this.latestStatusCode = latestStatusCode;
    }

    public String getLatestStatusDerivedCode() {
        return latestStatusDerivedCode;
    }

    public void setLatestStatusDerivedCode(String latestStatusDerivedCode) {
        this.latestStatusDerivedCode = latestStatusDerivedCode;
    }

    public String getLatestStatusAncillaryReason() {
        return latestStatusAncillaryReason;
    }

    public void setLatestStatusAncillaryReason(String latestStatusAncillaryReason) {
        this.latestStatusAncillaryReason = latestStatusAncillaryReason;
    }

    public String getLatestStatusAncillaryReasonDescription() {
        return latestStatusAncillaryReasonDescription;
    }

    public void setLatestStatusAncillaryReasonDescription(String latestStatusAncillaryReasonDescription) {
        this.latestStatusAncillaryReasonDescription = latestStatusAncillaryReasonDescription;
    }

    public String getLatestStatusAncillaryAction() {
        return latestStatusAncillaryAction;
    }

    public void setLatestStatusAncillaryAction(String latestStatusAncillaryAction) {
        this.latestStatusAncillaryAction = latestStatusAncillaryAction;
    }

    public String getLatestStatusAncillaryActionDescription() {
        return latestStatusAncillaryActionDescription;
    }

    public void setLatestStatusAncillaryActionDescription(String latestStatusAncillaryActionDescription) {
        this.latestStatusAncillaryActionDescription = latestStatusAncillaryActionDescription;
    }

    public String getLatestStatusByLocale() {
        return latestStatusByLocale;
    }

    public void setLatestStatusByLocale(String latestStatusByLocale) {
        this.latestStatusByLocale = latestStatusByLocale;
    }

    public String getLatestStatusDescription() {
        return latestStatusDescription;
    }

    public void setLatestStatusDescription(String latestStatusDescription) {
        this.latestStatusDescription = latestStatusDescription;
    }

    public String getLatestStatusdelayType() {
        return latestStatusdelayType;
    }

    public void setLatestStatusdelayType(String latestStatusdelayType) {
        this.latestStatusdelayType = latestStatusdelayType;
    }

    public String getLatestStatusdelaysubType() {
        return latestStatusdelaysubType;
    }

    public void setLatestStatusdelaysubType(String latestStatusdelaysubType) {
        this.latestStatusdelaysubType = latestStatusdelaysubType;
    }

    public String getLatestStatusdelayStatus() {
        return latestStatusdelayStatus;
    }

    public void setLatestStatusdelayStatus(String latestStatusdelayStatus) {
        this.latestStatusdelayStatus = latestStatusdelayStatus;
    }

    public String getServiceCommitMessage() {
        return serviceCommitMessage;
    }

    public void setServiceCommitMessage(String serviceCommitMessage) {
        this.serviceCommitMessage = serviceCommitMessage;
    }

    public String getServiceCommitType() {
        return serviceCommitType;
    }

    public void setServiceCommitType(String serviceCommitType) {
        this.serviceCommitType = serviceCommitType;
    }



    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }







    public String getDeliveryreceivedByName() {
        return deliveryreceivedByName;
    }

    public void setDeliveryreceivedByName(String deliveryreceivedByName) {
        this.deliveryreceivedByName = deliveryreceivedByName;
    }

    public String getDeliverydestinationServiceArea() {
        return deliverydestinationServiceArea;
    }

    public void setDeliverydestinationServiceArea(String deliverydestinationServiceArea) {
        this.deliverydestinationServiceArea = deliverydestinationServiceArea;
    }

    public String getDeliverydestinationServiceAreadescription() {
        return deliverydestinationServiceAreadescription;
    }

    public void setDeliverydestinationServiceAreadescription(String deliverydestinationServiceAreadescription) {
        this.deliverydestinationServiceAreadescription = deliverydestinationServiceAreadescription;
    }

    public String getDeliverylocationDescription() {
        return deliverylocationDescription;
    }

    public void setDeliverylocationDescription(String deliverylocationDescription) {
        this.deliverylocationDescription = deliverylocationDescription;
    }

    public String getActualAddressclassification() {
        return actualAddressclassification;
    }

    public void setActualAddressclassification(String actualAddressclassification) {
        this.actualAddressclassification = actualAddressclassification;
    }

    public Boolean getActualAddressresidental() {
        return actualAddressresidental;
    }

    public void setActualAddressresidental(Boolean actualAddressresidental) {
        this.actualAddressresidental = actualAddressresidental;
    }

    public String getActualAddressstreetLines() {
        return actualAddressstreetLines;
    }

    public void setActualAddressstreetLines(String actualAddressstreetLines) {
        this.actualAddressstreetLines = actualAddressstreetLines;
    }

    public String getActualAddressCity() {
        return actualAddressCity;
    }

    public void setActualAddressCity(String actualAddressCity) {
        this.actualAddressCity = actualAddressCity;
    }

    public String getActualAddressurbanizationCode() {
        return actualAddressurbanizationCode;
    }

    public void setActualAddressurbanizationCode(String actualAddressurbanizationCode) {
        this.actualAddressurbanizationCode = actualAddressurbanizationCode;
    }

    public String getActualAddressstateOrProvinceCode() {
        return actualAddressstateOrProvinceCode;
    }

    public void setActualAddressstateOrProvinceCode(String actualAddressstateOrProvinceCode) {
        this.actualAddressstateOrProvinceCode = actualAddressstateOrProvinceCode;
    }

    public String getActualAddresspostalCode() {
        return actualAddresspostalCode;
    }

    public void setActualAddresspostalCode(String actualAddresspostalCode) {
        this.actualAddresspostalCode = actualAddresspostalCode;
    }

    public String getActualAddresscountryCode() {
        return actualAddresscountryCode;
    }

    public void setActualAddresscountryCode(String actualAddresscountryCode) {
        this.actualAddresscountryCode = actualAddresscountryCode;
    }

    public String getActualAddresscountryName() {
        return actualAddresscountryName;
    }

    public void setActualAddresscountryName(String actualAddresscountryName) {
        this.actualAddresscountryName = actualAddresscountryName;
    }

    public Boolean getDeliveryToday() {
        return deliveryToday;
    }

    public void setDeliveryToday(Boolean deliveryToday) {
        this.deliveryToday = deliveryToday;
    }

    public String getDeliverylocationType() {
        return deliverylocationType;
    }

    public void setDeliverylocationType(String deliverylocationType) {
        this.deliverylocationType = deliverylocationType;
    }

    public String getDeliverysignedByName() {
        return deliverysignedByName;
    }

    public void setDeliverysignedByName(String deliverysignedByName) {
        this.deliverysignedByName = deliverysignedByName;
    }

    public String getOfficeOrderDeliveryMethod() {
        return officeOrderDeliveryMethod;
    }

    public void setOfficeOrderDeliveryMethod(String officeOrderDeliveryMethod) {
        this.officeOrderDeliveryMethod = officeOrderDeliveryMethod;
    }

    public String getDeliveryattempts() {
        return deliveryattempts;
    }

    public void setDeliveryattempts(String deliveryattempts) {
        this.deliveryattempts = deliveryattempts;
    }



    public String getScanEventsDate() {
        return scanEventsDate;
    }

    public void setScanEventsDate(String scanEventsDate) {
        this.scanEventsDate = scanEventsDate;
    }

    public String getScanEventsderivedStatus() {
        return scanEventsderivedStatus;
    }

    public void setScanEventsderivedStatus(String scanEventsderivedStatus) {
        this.scanEventsderivedStatus = scanEventsderivedStatus;
    }

    public String getScanLocatoinaddressClassification() {
        return scanLocatoinaddressClassification;
    }

    public void setScanLocatoinaddressClassification(String scanLocatoinaddressClassification) {
        this.scanLocatoinaddressClassification = scanLocatoinaddressClassification;
    }

    public Boolean getScanLocationResdential() {
        return scanLocationResdential;
    }

    public void setScanLocationResdential(Boolean scanLocationResdential) {
        this.scanLocationResdential = scanLocationResdential;
    }

    public String getScanLocationstreetLines() {
        return scanLocationstreetLines;
    }

    public void setScanLocationstreetLines(String scanLocationstreetLines) {
        this.scanLocationstreetLines = scanLocationstreetLines;
    }

    public String getScanLocationCity() {
        return scanLocationCity;
    }

    public void setScanLocationCity(String scanLocationCity) {
        this.scanLocationCity = scanLocationCity;
    }

    public String getScanLocationurbanizationCode() {
        return scanLocationurbanizationCode;
    }

    public void setScanLocationurbanizationCode(String scanLocationurbanizationCode) {
        this.scanLocationurbanizationCode = scanLocationurbanizationCode;
    }

    public String getScanLocationstateOrProvinceCode() {
        return scanLocationstateOrProvinceCode;
    }

    public void setScanLocationstateOrProvinceCode(String scanLocationstateOrProvinceCode) {
        this.scanLocationstateOrProvinceCode = scanLocationstateOrProvinceCode;
    }

    public String getScanLocationpostalCode() {
        return scanLocationpostalCode;
    }

    public void setScanLocationpostalCode(String scanLocationpostalCode) {
        this.scanLocationpostalCode = scanLocationpostalCode;
    }

    public String getScanLocationcountryCode() {
        return scanLocationcountryCode;
    }

    public void setScanLocationcountryCode(String scanLocationcountryCode) {
        this.scanLocationcountryCode = scanLocationcountryCode;
    }

    public String getScanLocationcountryName() {
        return scanLocationcountryName;
    }

    public void setScanLocationcountryName(String scanLocationcountryName) {
        this.scanLocationcountryName = scanLocationcountryName;
    }

    public String getScanEventsLocationId() {
        return scanEventsLocationId;
    }

    public void setScanEventsLocationId(String scanEventsLocationId) {
        this.scanEventsLocationId = scanEventsLocationId;
    }

    public String getScanEventsLocationType() {
        return scanEventsLocationType;
    }

    public void setScanEventsLocationType(String scanEventsLocationType) {
        this.scanEventsLocationType = scanEventsLocationType;
    }

    public String getScanEventsexceptionDescription() {
        return scanEventsexceptionDescription;
    }

    public void setScanEventsexceptionDescription(String scanEventsexceptionDescription) {
        this.scanEventsexceptionDescription = scanEventsexceptionDescription;
    }

    public String getScanEventDescription() {
        return scanEventDescription;
    }

    public void setScanEventDescription(String scanEventDescription) {
        this.scanEventDescription = scanEventDescription;
    }

    public String getScaneventType() {
        return scaneventType;
    }

    public void setScaneventType(String scaneventType) {
        this.scaneventType = scaneventType;
    }

    public String getScanEventsderivedStatusCode() {
        return scanEventsderivedStatusCode;
    }

    public void setScanEventsderivedStatusCode(String scanEventsderivedStatusCode) {
        this.scanEventsderivedStatusCode = scanEventsderivedStatusCode;
    }

    public String getScanEventsexceptionCode() {
        return scanEventsexceptionCode;
    }

    public void setScanEventsexceptionCode(String scanEventsexceptionCode) {
        this.scanEventsexceptionCode = scanEventsexceptionCode;
    }

    public String getScanEventsdelayDetailType() {
        return scanEventsdelayDetailType;
    }

    public void setScanEventsdelayDetailType(String scanEventsdelayDetailType) {
        this.scanEventsdelayDetailType = scanEventsdelayDetailType;
    }

    public String getScanEventsdelayDetailsubType() {
        return scanEventsdelayDetailsubType;
    }

    public void setScanEventsdelayDetailsubType(String scanEventsdelayDetailsubType) {
        this.scanEventsdelayDetailsubType = scanEventsdelayDetailsubType;
    }

    public String getScanEventsdelayDetailStatus() {
        return scanEventsdelayDetailStatus;
    }

    public void setScanEventsdelayDetailStatus(String scanEventsdelayDetailStatus) {
        this.scanEventsdelayDetailStatus = scanEventsdelayDetailStatus;
    }

    public String getGoodsClassificationCode() {
        return goodsClassificationCode;
    }

    public void setGoodsClassificationCode(String goodsClassificationCode) {
        this.goodsClassificationCode = goodsClassificationCode;
    }

    public String getPhysicalPackagingType() {
        return physicalPackagingType;
    }

    public void setPhysicalPackagingType(String physicalPackagingType) {
        this.physicalPackagingType = physicalPackagingType;
    }

    public String getPackagesequenceNumber() {
        return packagesequenceNumber;
    }

    public void setPackagesequenceNumber(String packagesequenceNumber) {
        this.packagesequenceNumber = packagesequenceNumber;
    }

    public String getUndeliveredpackageCount() {
        return undeliveredpackageCount;
    }

    public void setUndeliveredpackageCount(String undeliveredpackageCount) {
        this.undeliveredpackageCount = undeliveredpackageCount;
    }

    public String getPackageDescription() {
        return packageDescription;
    }

    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(String packageCount) {
        this.packageCount = packageCount;
    }





    public String getPackageContent() {
        return packageContent;
    }

    public void setPackageContent(String packageContent) {
        this.packageContent = packageContent;
    }

    public String getPackagePieceCount() {
        return packagePieceCount;
    }

    public void setPackagePieceCount(String packagePieceCount) {
        this.packagePieceCount = packagePieceCount;
    }

    public String getDeclaredValueCurrency() {
        return declaredValueCurrency;
    }

    public void setDeclaredValueCurrency(String declaredValueCurrency) {
        this.declaredValueCurrency = declaredValueCurrency;
    }

    public Double getDeclaredValueAmount() {
        return declaredValueAmount;
    }

    public void setDeclaredValueAmount(Double declaredValueAmount) {
        this.declaredValueAmount = declaredValueAmount;
    }

    public String getDateAndTime() {
        return dateAndTimes;
    }

    public void setDateAndTime(String dateAndTimes) {
        this.dateAndTimes = dateAndTimes;
    }



    public String getRequestedAppointmentDate() {
        return requestedAppointmentDate;
    }

    public void setRequestedAppointmentDate(String requestedAppointmentDate) {
        this.requestedAppointmentDate = requestedAppointmentDate;
    }







    public String getCustomDeliveryOptionsdescription() {
        return customDeliveryOptionsdescription;
    }

    public void setCustomDeliveryOptionsdescription(String customDeliveryOptionsdescription) {
        this.customDeliveryOptionsdescription = customDeliveryOptionsdescription;
    }

    public String getCustomDeliveryOptionsType() {
        return customDeliveryOptionsType;
    }

    public void setCustomDeliveryOptionsType(String customDeliveryOptionsType) {
        this.customDeliveryOptionsType = customDeliveryOptionsType;
    }

    public String getCustomDeliveryOptionsStatus() {
        return customDeliveryOptionsStatus;
    }

    public void setCustomDeliveryOptionsStatus(String customDeliveryOptionsStatus) {
        this.customDeliveryOptionsStatus = customDeliveryOptionsStatus;
    }

    public String getHoldLocationID() {
        return holdLocationID;
    }

    public void setHoldLocationID(String holdLocationID) {
        this.holdLocationID = holdLocationID;
    }

    public String getHoldLocationpersonName() {
        return holdLocationpersonName;
    }

    public void setHoldLocationpersonName(String holdLocationpersonName) {
        this.holdLocationpersonName = holdLocationpersonName;
    }

    public String getHoldLocationphoneNumber() {
        return holdLocationphoneNumber;
    }

    public void setHoldLocationphoneNumber(String holdLocationphoneNumber) {
        this.holdLocationphoneNumber = holdLocationphoneNumber;
    }

    public String getHoldLocationCompanyName() {
        return holdLocationCompanyName;
    }

    public void setHoldLocationCompanyName(String holdLocationCompanyName) {
        this.holdLocationCompanyName = holdLocationCompanyName;
    }

    public String getHoldLocationaddressClassification() {
        return holdLocationaddressClassification;
    }

    public void setHoldLocationaddressClassification(String holdLocationaddressClassification) {
        this.holdLocationaddressClassification = holdLocationaddressClassification;
    }

    public Boolean getHoldLocationResidential() {
        return holdLocationResidential;
    }

    public void setHoldLocationResidential(Boolean holdLocationResidential) {
        this.holdLocationResidential = holdLocationResidential;
    }

    public String getHoldLocationstreetLines() {
        return holdLocationstreetLines;
    }

    public void setHoldLocationstreetLines(String holdLocationstreetLines) {
        this.holdLocationstreetLines = holdLocationstreetLines;
    }

    public String getHoldLocationCity() {
        return holdLocationCity;
    }

    public void setHoldLocationCity(String holdLocationCity) {
        this.holdLocationCity = holdLocationCity;
    }

    public String getHoldLocationurbanizationCode() {
        return holdLocationurbanizationCode;
    }

    public void setHoldLocationurbanizationCode(String holdLocationurbanizationCode) {
        this.holdLocationurbanizationCode = holdLocationurbanizationCode;
    }

    public String getHoldLocationstateOrProvinceCode() {
        return holdLocationstateOrProvinceCode;
    }

    public void setHoldLocationstateOrProvinceCode(String holdLocationstateOrProvinceCode) {
        this.holdLocationstateOrProvinceCode = holdLocationstateOrProvinceCode;
    }

    public String getHoldLocationpostalCode() {
        return holdLocationpostalCode;
    }

    public void setHoldLocationpostalCode(String holdLocationpostalCode) {
        this.holdLocationpostalCode = holdLocationpostalCode;
    }

    public String getHoldLocationcountryCode() {
        return holdLocationcountryCode;
    }

    public void setHoldLocationcountryCode(String holdLocationcountryCode) {
        this.holdLocationcountryCode = holdLocationcountryCode;
    }

    public String getHoldLocationcountryName() {
        return holdLocationcountryName;
    }

    public void setHoldLocationcountryName(String holdLocationcountryName) {
        this.holdLocationcountryName = holdLocationcountryName;
    }

    public String getHoldLocationType() {
        return holdLocationType;
    }

    public void setHoldLocationType(String holdLocationType) {
        this.holdLocationType = holdLocationType;
    }

    public String getEstimatedDeliveryTimeDescription() {
        return estimatedDeliveryTimeDescription;
    }

    public void setEstimatedDeliveryTimeDescription(String estimatedDeliveryTimeDescription) {
        this.estimatedDeliveryTimeDescription = estimatedDeliveryTimeDescription;
    }

    public String getEstimatedDeliveryTimeWindowbegins() {
        return estimatedDeliveryTimeWindowbegins;
    }

    public void setEstimatedDeliveryTimeWindowbegins(String estimatedDeliveryTimeWindowbegins) {
        this.estimatedDeliveryTimeWindowbegins = estimatedDeliveryTimeWindowbegins;
    }

    public String getEstimatedDeliveryTimeWindowends() {
        return estimatedDeliveryTimeWindowends;
    }

    public void setEstimatedDeliveryTimeWindowends(String estimatedDeliveryTimeWindowends) {
        this.estimatedDeliveryTimeWindowends = estimatedDeliveryTimeWindowends;
    }

    public String getEstimatedDeliveryTimeWindowType() {
        return estimatedDeliveryTimeWindowType;
    }

    public void setEstimatedDeliveryTimeWindowType(String estimatedDeliveryTimeWindowType) {
        this.estimatedDeliveryTimeWindowType = estimatedDeliveryTimeWindowType;
    }

    public String getPieceCounts() {
        return pieceCounts;
    }

    public void setPieceCounts(String pieceCountsCount) {
        this.pieceCounts = pieceCounts;
    }





    public String getOriginLocationId() {
        return originLocationId;
    }

    public void setOriginLocationId(String originLocationId) {
        this.originLocationId = originLocationId;
    }

    public String getOriginLocationPersonName() {
        return originLocationPersonName;
    }

    public void setOriginLocationPersonName(String originLocationPersonName) {
        this.originLocationPersonName = originLocationPersonName;
    }

    public String getOriginLocationPhoneNumber() {
        return originLocationPhoneNumber;
    }

    public void setOriginLocationPhoneNumber(String originLocationPhoneNumber) {
        this.originLocationPhoneNumber = originLocationPhoneNumber;
    }

    public String getOriginLocationCompanyName() {
        return originLocationCompanyName;
    }

    public void setOriginLocationCompanyName(String originLocationCompanyName) {
        this.originLocationCompanyName = originLocationCompanyName;
    }

    public String getOriginLocationAddressClassification() {
        return originLocationAddressClassification;
    }

    public void setOriginLocationAddressClassification(String originLocationAddressClassification) {
        this.originLocationAddressClassification = originLocationAddressClassification;
    }

    public boolean isOriginLocationResidential() {
        return originLocationResidential;
    }

    public void setOriginLocationResidential(boolean originLocationResidential) {
        this.originLocationResidential = originLocationResidential;
    }

    public String getOriginLocationStreetLines() {
        return originLocationStreetLines;
    }

    public void setOriginLocationStreetLines(String originLocationStreetLines) {
        this.originLocationStreetLines = originLocationStreetLines;
    }

    public String getOriginLocationCity() {
        return originLocationCity;
    }

    public void setOriginLocationCity(String originLocationCity) {
        this.originLocationCity = originLocationCity;
    }

    public String getOriginLocationUrbanizationCode() {
        return originLocationUrbanizationCode;
    }

    public void setOriginLocationUrbanizationCode(String originLocationUrbanizationCode) {
        this.originLocationUrbanizationCode = originLocationUrbanizationCode;
    }

    public String getOriginLocationStateOrProvinceCode() {
        return originLocationStateOrProvinceCode;
    }

    public void setOriginLocationStateOrProvinceCode(String originLocationStateOrProvinceCode) {
        this.originLocationStateOrProvinceCode = originLocationStateOrProvinceCode;
    }

    public String getOriginLocationPostalCode() {
        return originLocationPostalCode;
    }

    public void setOriginLocationPostalCode(String originLocationPostalCode) {
        this.originLocationPostalCode = originLocationPostalCode;
    }

    public String getOriginLocationcountryCode() {
        return originLocationcountryCode;
    }

    public void setOriginLocationcountryCode(String originLocationcountryCode) {
        this.originLocationcountryCode = originLocationcountryCode;
    }

    public String getOriginLocationCountryName() {
        return originLocationCountryName;
    }

    public void setOriginLocationCountryName(String originLocationCountryName) {
        this.originLocationCountryName = originLocationCountryName;
    }

    public String getOriginLocationType() {
        return originLocationType;
    }

    public void setOriginLocationType(String originLocationType) {
        this.originLocationType = originLocationType;
    }

    public String getRecipientPersonName() {
        return recipientPersonName;
    }

    public void setRecipientPersonName(String recipientPersonName) {
        this.recipientPersonName = recipientPersonName;
    }

    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }

    public void setRecipientPhoneNumber(String recipientPhoneNumber) {
        this.recipientPhoneNumber = recipientPhoneNumber;
    }

    public String getRecipientCompanyName() {
        return recipientCompanyName;
    }

    public void setRecipientCompanyName(String recipientCompanyName) {
        this.recipientCompanyName = recipientCompanyName;
    }

    public String getRecipientAddressClassification() {
        return recipientAddressClassification;
    }

    public void setRecipientAddressClassification(String recipientAddressClassification) {
        this.recipientAddressClassification = recipientAddressClassification;
    }

    public boolean isRecipientResidential() {
        return recipientResidential;
    }

    public void setRecipientResidential(boolean recipientResidential) {
        this.recipientResidential = recipientResidential;
    }

    public String getRecipientStreetLines() {
        return recipientStreetLines;
    }

    public void setRecipientStreetLines(String recipientStreetLines) {
        this.recipientStreetLines = recipientStreetLines;
    }

    public String getRecipientCity() {
        return recipientCity;
    }

    public void setRecipientCity(String recipientCity) {
        this.recipientCity = recipientCity;
    }

    public String getRecipientUrbanizationCode() {
        return recipientUrbanizationCode;
    }

    public void setRecipientUrbanizationCode(String recipientUrbanizationCode) {
        this.recipientUrbanizationCode = recipientUrbanizationCode;
    }

    public String getRecipientStateOrProvinceCode() {
        return recipientStateOrProvinceCode;
    }

    public void setRecipientStateOrProvinceCode(String recipientStateOrProvinceCode) {
        this.recipientStateOrProvinceCode = recipientStateOrProvinceCode;
    }

    public String getRecipientPostalCode() {
        return recipientPostalCode;
    }

    public void setRecipientPostalCode(String recipientPostalCode) {
        this.recipientPostalCode = recipientPostalCode;
    }

    public String getRecipientCountryCode() {
        return recipientCountryCode;
    }

    public void setRecipientCountryCode(String recipientCountryCode) {
        this.recipientCountryCode = recipientCountryCode;
    }

    public String getRecipientCountryName() {
        return recipientCountryName;
    }

    public void setRecipientCountryName(String recipientCountryName) {
        this.recipientCountryName = recipientCountryName;
    }

    public String getStdTransitTimeWindowDescription() {
        return stdTransitTimeWindowDescription;
    }

    public void setStdTransitTimeWindowDescription(String stdTransitTimeWindowDescription) {
        this.stdTransitTimeWindowDescription = stdTransitTimeWindowDescription;
    }

    public String getStdTransitTimeWindowBegins() {
        return stdTransitTimeWindowBegins;
    }

    public void setStdTransitTimeWindowBegins(String stdTransitTimeWindowBegins) {
        this.stdTransitTimeWindowBegins = stdTransitTimeWindowBegins;
    }

    public String getStdTransitTimeWindowEnds() {
        return stdTransitTimeWindowEnds;
    }

    public void setStdTransitTimeWindowEnds(String stdTransitTimeWindowEnds) {
        this.stdTransitTimeWindowEnds = stdTransitTimeWindowEnds;
    }

    public String getStdTransitTimeWindowType() {
        return stdTransitTimeWindowType;
    }

    public void setStdTransitTimeWindowType(String stdTransitTimeWindowType) {
        this.stdTransitTimeWindowType = stdTransitTimeWindowType;
    }

    public String getShipmentContentItemNumber() {
        return shipmentContentItemNumber;
    }

    public void setShipmentContentItemNumber(String shipmentContentItemNumber) {
        this.shipmentContentItemNumber = shipmentContentItemNumber;
    }

    public String getShipmentContentReceivedQuantity() {
        return shipmentContentReceivedQuantity;
    }

    public void setShipmentContentReceivedQuantity(String shipmentContentReceivedQuantity) {
        this.shipmentContentReceivedQuantity = shipmentContentReceivedQuantity;
    }

    public String getShipmentContentdescription() {
        return shipmentContentdescription;
    }

    public void setShipmentContentdescription(String shipmentContentdescription) {
        this.shipmentContentdescription = shipmentContentdescription;
    }

    public String getShipmentContentPartNumber() {
        return shipmentContentPartNumber;
    }

    public void setShipmentContentPartNumber(String shipmentContentPartNumber) {
        this.shipmentContentPartNumber = shipmentContentPartNumber;
    }

    public boolean isShipmentbeforePossessionStatus() {
        return shipmentbeforePossessionStatus;
    }

    public void setShipmentbeforePossessionStatus(boolean shipmentbeforePossessionStatus) {
        this.shipmentbeforePossessionStatus = shipmentbeforePossessionStatus;
    }

    public String getShipmentWeight() {
        return shipmentWeight;
    }

    public void setShipmentWeight(String shipmentWeightUnit) {
        this.shipmentWeight = shipmentWeight;
    }


    public String getShipmentcontentPieceCount() {
        return shipmentcontentPieceCount;
    }

    public void setShipmentcontentPieceCount(String shipmentcontentPieceCount) {
        this.shipmentcontentPieceCount = shipmentcontentPieceCount;
    }

    public String getSplitShipmentsPieceCount() {
        return splitShipmentsPieceCount;
    }

    public void setSplitShipmentsPieceCount(String splitShipmentsPieceCount) {
        this.splitShipmentsPieceCount = splitShipmentsPieceCount;
    }

    public String getSplitShipmentsStatusDesp() {
        return splitShipmentsStatusDesp;
    }

    public void setSplitShipmentsStatusDesp(String splitShipmentsStatusDesp) {
        this.splitShipmentsStatusDesp = splitShipmentsStatusDesp;
    }

    public String getSplitShipmentstimeStamp() {
        return splitShipmentstimeStamp;
    }

    public void setSplitShipmentstimeStamp(String splitShipmentstimeStamp) {
        this.splitShipmentstimeStamp = splitShipmentstimeStamp;
    }

    public String getSplitShipmentsStatusCode() {
        return splitShipmentsStatusCode;
    }

    public void setSplitShipmentsStatusCode(String splitShipmentsStatusCode) {
        this.splitShipmentsStatusCode = splitShipmentsStatusCode;
    }

    public String getReasonDetailDescription() {
        return reasonDetailDescription;
    }

    public void setReasonDetailDescription(String reasonDetailDescription) {
        this.reasonDetailDescription = reasonDetailDescription;
    }

    public String getReasonDetailType() {
        return reasonDetailType;
    }

    public void setReasonDetailType(String reasonDetailType) {
        this.reasonDetailType = reasonDetailType;
    }

    public String getAvailableNotifications() {
        return availableNotifications;
    }

    public void setAvailableNotifications(String availableNotifications) {
        this.availableNotifications = availableNotifications;
    }



    public String getShipperAddressClassification() {
        return shipperAddressClassification;
    }

    public void setShipperAddressClassification(String shipperAddressClassification) {
        this.shipperAddressClassification = shipperAddressClassification;
    }

    public boolean isShipperResidential() {
        return shipperResidential;
    }

    public void setShipperResidential(boolean shipperResidential) {
        this.shipperResidential = shipperResidential;
    }

    public String getShipperStreetLines() {
        return shipperStreetLines;
    }

    public void setShipperStreetLines(String shipperStreetLines) {
        this.shipperStreetLines = shipperStreetLines;
    }

    public String getShipperCity() {
        return shipperCity;
    }

    public void setShipperCity(String shipperCity) {
        this.shipperCity = shipperCity;
    }

    public String getShipperUrbanizationCode() {
        return shipperUrbanizationCode;
    }

    public void setShipperUrbanizationCode(String shipperUrbanizationCode) {
        this.shipperUrbanizationCode = shipperUrbanizationCode;
    }

    public String getShipperStateOrProvinceCode() {
        return shipperStateOrProvinceCode;
    }

    public void setShipperStateOrProvinceCode(String shipperStateOrProvinceCode) {
        this.shipperStateOrProvinceCode = shipperStateOrProvinceCode;
    }

    public String getShipperPostalCode() {
        return shipperPostalCode;
    }

    public void setShipperPostalCode(String shipperPostalCode) {
        this.shipperPostalCode = shipperPostalCode;
    }

    public String getShipperCountryCode() {
        return shipperCountryCode;
    }

    public void setShipperCountryCode(String shipperCountryCode) {
        this.shipperCountryCode = shipperCountryCode;
    }

    public String getShipperCountryName() {
        return shipperCountryName;
    }

    public void setShipperCountryName(String shipperCountryName) {
        this.shipperCountryName = shipperCountryName;
    }

    public String getLastUpdatedDestinationAddressClassification() {
        return lastUpdatedDestinationAddressClassification;
    }

    public void setLastUpdatedDestinationAddressClassification(String lastUpdatedDestinationAddressClassification) {
        this.lastUpdatedDestinationAddressClassification = lastUpdatedDestinationAddressClassification;
    }

    public boolean isLastUpdatedDestinationAddressResidential() {
        return lastUpdatedDestinationAddressResidential;
    }

    public void setLastUpdatedDestinationAddressResidential(boolean lastUpdatedDestinationAddressResidential) {
        this.lastUpdatedDestinationAddressResidential = lastUpdatedDestinationAddressResidential;
    }

    public String getLastUpdatedDestinationAddressStreetLines() {
        return lastUpdatedDestinationAddressStreetLines;
    }

    public void setLastUpdatedDestinationAddressStreetLines(String lastUpdatedDestinationAddressStreetLines) {
        this.lastUpdatedDestinationAddressStreetLines = lastUpdatedDestinationAddressStreetLines;
    }

    public String getLastUpdatedDestinationAddressCity() {
        return lastUpdatedDestinationAddressCity;
    }

    public void setLastUpdatedDestinationAddressCity(String lastUpdatedDestinationAddressCity) {
        this.lastUpdatedDestinationAddressCity = lastUpdatedDestinationAddressCity;
    }

    public String getLastUpdatedDestinationAddressUrbanizationCode() {
        return lastUpdatedDestinationAddressUrbanizationCode;
    }

    public void setLastUpdatedDestinationAddressUrbanizationCode(String lastUpdatedDestinationAddressUrbanizationCode) {
        this.lastUpdatedDestinationAddressUrbanizationCode = lastUpdatedDestinationAddressUrbanizationCode;
    }

    public String getLastUpdatedDestinationAddressStateOrProvinceCode() {
        return lastUpdatedDestinationAddressStateOrProvinceCode;
    }

    public void setLastUpdatedDestinationAddressStateOrProvinceCode(String lastUpdatedDestinationAddressStateOrProvinceCode) {
        this.lastUpdatedDestinationAddressStateOrProvinceCode = lastUpdatedDestinationAddressStateOrProvinceCode;
    }

    public String getLastUpdatedDestinationAddressPostalCode() {
        return lastUpdatedDestinationAddressPostalCode;
    }

    public void setLastUpdatedDestinationAddressPostalCode(String lastUpdatedDestinationAddressPostalCode) {
        this.lastUpdatedDestinationAddressPostalCode = lastUpdatedDestinationAddressPostalCode;
    }

    public String getLastUpdatedDestinationAddressCountryCode() {
        return lastUpdatedDestinationAddressCountryCode;
    }

    public void setLastUpdatedDestinationAddressCountryCode(String lastUpdatedDestinationAddressCountryCode) {
        this.lastUpdatedDestinationAddressCountryCode = lastUpdatedDestinationAddressCountryCode;
    }

    public String getLastUpdatedDestinationAddressCountryName() {
        return lastUpdatedDestinationAddressCountryName;
    }

    public void setLastUpdatedDestinationAddressCountryName(String lastUpdatedDestinationAddressCountryName) {
        this.lastUpdatedDestinationAddressCountryName = lastUpdatedDestinationAddressCountryName;
    }

    public String getAlerts() {
        return alerts;
    }

    public void setAlerts(String alerts) {
        this.alerts = alerts;
    }

    @Column(name = "trackingnumber")
    private String trackingNumber  ;
    @Column(name = "carriercode")
    private String carrierCode  ;
    @Column(name = "trackingnumberuniqueid")
    private String trackingNumberUniqueId  ;
    @Column(name = "hasassociatedshipments")
    private boolean hasAssociatedShipments   ;
    @Column(name = "nickname")
    private String  nickname  ;
    @Column(name = "shipmentnotes")
    private String shipmentNotes;
    @Column(name = "packageidentifiers",columnDefinition = "json")
    private String packageIdentifiers  ;

    public String getPackageIdentifiers() {
        return packageIdentifiers;
    }

    public void setPackageIdentifiers(String packageIdentifiers) {
        this.packageIdentifiers = packageIdentifiers;
    }

    @Column(name = "distancetodestinationunits")
    private String distanceToDestinationUnits  ;
    @Column(name = "distancetodestinationvalue")
    private double distanceToDestinationValue   ;
    @Column(name = "consolidationdetailtimestamp")
    private String consolidationDetailTimeStamp   ;
    @Column(name = "consolidationid")
    private String consolidationID  ;
    @Column(name = "consolidationreasondetaildescription")
    private String consolidationreasonDetailDescription  ;
    @Column(name = "consolidationreasondetailtype")
    private String consolidationreasonDetailType;
    @Column(name = "consolidationpackagecount")
    private int consolidationPackageCount;
    @Column(name = "consolidationeventtype")
    private String consolidationEventType  ;
    @Column(name = "meternumber")
    private String meterNumber ;
    @Column(name = "returnauthorizationname")
    private String returnAuthorizationName  ;
    @Column(name = "returnreasondetaildescription")
    private String returnReasonDetailDescription  ;
    @Column(name = "returnreasondetailtype")
    private  String returnReasonDetailType  ;
    @Column(name = "servicedescription")
    private String serviceDescription  ;
    @Column(name = "serviceshortdescription")
    private String serviceShortDescription  ;
    @Column(name = "servicetype")
    private String serviceType  ;
    @Column(name = "destlocationid")
    private String destLocationId  ;
    @Column(name = "destpersonname")
    private String destPersonName  ;
    @Column(name = "destphonenumber")
    private String destPhoneNumber  ;
    @Column(name = "destcompanyname")
    private String destCompanyName  ;
    @Column(name = "destaddressclassification")
    private String destAddressClassification  ;
    @Column(name = "destresidential")
    private boolean destResidential   ;
    @Column(name = "deststreetlines")
    private String destStreetLines  ;
    @Column(name = "destcity")
    private String destCity  ;
    @Column(name = "desturbanizationcode")
    private String destUrbanizationCode  ;
    @Column(name = "deststateorprovincecode")
    private String destStateOrProvinceCode  ;
    @Column(name = "destpostalcode")
    private String destPostalCode  ;
    @Column(name = "destcountrycode")
    private String destCountryCode  ;
    @Column(name = "destcountryname")
    private String destCountryName  ;
    @Column(name = "destlocationtype")
    private String destLocationType  ;
    @Column(name = "lateststatusaddressclassification")
    private String latestStatusAddressClassification  ;
    @Column(name = "lateststatusresidential")
    private boolean latestStatusResidential   ;
    @Column(name = "lateststatusstreetlines")
    private String latestStatusStreetLines  ;
    @Column(name = "lateststatuscity")
    private String latestStatusCity  ;
    @Column(name = "lateststatusurbanizationcode")
    private String latestStatusUrbanizationCode  ;
    @Column(name = "lateststatusstateorprovincecode")
    private String latestStatusStateOrProvinceCode  ;
    @Column(name = "lateststatuspostalcode")
    private String latestStatusPostalCode  ;
    @Column(name = "lateststatuscountrycode")
    private String latestStatusCountryCode  ;
    @Column(name = "lateststatuscountryname")
    private String latestStatusCountryName  ;
    @Column(name = "lateststatuscode")
    private String latestStatusCode  ;
    @Column(name = "lateststatusderivedcode")
    private String latestStatusDerivedCode  ;
    @Column(name = "lateststatusancillaryreason")
    private String latestStatusAncillaryReason  ;
    @Column(name = "lateststatusancillaryreasondescription")
    private String latestStatusAncillaryReasonDescription  ;
    @Column(name = "lateststatusancillaryaction")
    private String latestStatusAncillaryAction  ;
    @Column(name = "lateststatusancillaryactiondescription")
    private String latestStatusAncillaryActionDescription  ;
    @Column(name = "lateststatusbylocale")
    private String latestStatusByLocale;
    @Column(name = "lateststatusdescription")
    private String latestStatusDescription;
    @Column(name = "lateststatusdelaytype")
    private String latestStatusdelayType;
    @Column(name = "lateststatusdelaysubtype")
    private String latestStatusdelaysubType  ;
    @Column(name = "lateststatusdelaystatus")
    private String latestStatusdelayStatus  ;
    @Column(name = "servicecommitmessage")
    private String serviceCommitMessage  ;
    @Column(name = "servicecommittype")
    private String serviceCommitType  ;

    //@Type(type="json")
    @Column(name = "informationnotes",columnDefinition = "json")
    private  String informationNotes  ;

    public String getInformationNotes() {
        return informationNotes;
    }

    public void setInformationNotes(String informationNotes) {
        this.informationNotes = informationNotes;
    }

    @Column(name = "errorcode")
    private String errorCode  ;

    public String getErrorParameterList() {
        return errorParameterList;
    }

    public void setErrorParameterList(String errorParameterList) {
        this.errorParameterList = errorParameterList;
    }

    // @Type(type="json")
    @Column(name = "errorparameter",columnDefinition = "json")
    private String errorParameterList   ;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Column(name="errormessage")
    private String errorMessage;

   // @Type(type="json")
    @Column(name = "specialhandlings",columnDefinition = "json")
    private  String specialHandlings  ;

    public String getSpecialHandlings() {
        return specialHandlings;
    }

    public void setSpecialHandlings(String specialHandlings) {
        this.specialHandlings = specialHandlings;
    }

    public String getAvailableImages() {
        return availableImages;
    }

    public void setAvailableImages(String availableImages) {
        this.availableImages = availableImages;
    }

    // @Type(type="json")
    @Column(name = "availableimages",columnDefinition = "json")
    private String availableImages;


    @Column(name = "deliveryreceivedbyname")
    private String deliveryreceivedByName  ;
    @Column(name = "deliverydestinationservicearea")
    private String deliverydestinationServiceArea  ;
    @Column(name = "deliverydestinationserviceareadescription")
    private String deliverydestinationServiceAreadescription  ;
    @Column(name = "deliverylocationdescription")
    private String deliverylocationDescription  ;
    @Column(name = "actualaddressclassification")
    private String actualAddressclassification  ;
    @Column(name = "actualaddressresidental")
    private Boolean actualAddressresidental  ;
    @Column(name = "actualaddressstreetlines")
    private String actualAddressstreetLines  ;
    @Column(name = "actualaddresscity")
    private String actualAddressCity  ;
    @Column(name = "actualaddressurbanizationcode")
    private String actualAddressurbanizationCode  ;
    @Column(name = "actualaddressstateorprovincecode")
    private String actualAddressstateOrProvinceCode  ;
    @Column(name = "actualaddresspostalcode")
    private String actualAddresspostalCode  ;
    @Column(name = "actualAddresscountrycode")
    private String actualAddresscountryCode  ;
    @Column(name = "actualaddresscountryname")
    private String actualAddresscountryName  ;
    @Column(name="deliverytoday")
    private Boolean deliveryToday;
    @Column(name="deliverylocationtype")
    private String deliverylocationType;
    @Column(name="deliverysignedbyname")
    private String deliverysignedByName;
    @Column(name="officeorderdeliverymethod")
    private String officeOrderDeliveryMethod;
    @Column(name="deliveryattempts")
    private String deliveryattempts;

    public String getDeliveryOptionEligibilityDetails() {
        return deliveryOptionEligibilityDetails;
    }

    public void setDeliveryOptionEligibilityDetails(String deliveryOptionEligibilityDetails) {
        this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
    }

    //@Type(type="json")
    @Column(name="deliveryoptioneligibilitydetails",columnDefinition = "json")
    private String deliveryOptionEligibilityDetails;


    @Column(name="scaneventsdate")
    private String scanEventsDate   ;
    @Column(name="scaneventsderivedstatus")
    private String scanEventsderivedStatus  ;
    @Column(name="scanlocatoinaddressclassification")
    private String scanLocatoinaddressClassification  ;
    @Column(name="scanlocationresdential")
    private Boolean scanLocationResdential  ;
    @Column(name="scanlocationstreetlines")
    private String scanLocationstreetLines  ;
    @Column(name="scanlocationcity")
    private String scanLocationCity  ;
    @Column(name="scanlocationurbanizationcode")
    private String scanLocationurbanizationCode  ;
    @Column(name="scanlocationstateorprovincecode")
    private String scanLocationstateOrProvinceCode  ;
    @Column(name="scanlocationpostalcode")
    private String scanLocationpostalCode  ;
    @Column(name="scanlocationcountrycode")
    private String scanLocationcountryCode  ;
    @Column(name="scanlocationcountryname")
    private String scanLocationcountryName  ;
    @Column(name="scaneventslocationid")
    private String scanEventsLocationId  ;
    @Column(name="scaneventslocationtype")
    private String scanEventsLocationType  ;
    @Column(name="scaneventsexceptiondescription")
    private String scanEventsexceptionDescription  ;
    @Column(name="scaneventdescription")
    private String scanEventDescription  ;
    @Column(name="scaneventtype")
    private String scaneventType  ;
    @Column(name="scaneventsderivedstatuscode")
    private String scanEventsderivedStatusCode  ;
    @Column(name="scaneventsexceptioncode")
    private String scanEventsexceptionCode  ;
    @Column(name="scaneventsdelaydetailtype")
    private String scanEventsdelayDetailType  ;
    @Column(name="scaneventsdelaydetailsubtype")
    private String scanEventsdelayDetailsubType  ;
    @Column(name="scaneventsdelaydetailstatus")
    private String scanEventsdelayDetailStatus  ;
    @Column(name="goodsclassificationcode")
    private String goodsClassificationCode  ;
    @Column(name="physicalpackagingtype")
    private String physicalPackagingType  ;
    @Column(name="packagesequencenumber")
    private String packagesequenceNumber  ;
    @Column(name="undeliveredpackagecount")
    private String undeliveredpackageCount  ;

    @Column(name="packagedescription")
    private String packageDescription  ;
    @Column(name="packagetype")
    private String packageType  ;
    @Column(name="packagecount")
    private String packageCount  ;

    public String getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(String packageWeight) {
        this.packageWeight = packageWeight;
    }

    // @Type(type="json")
    @Column(name="packageweight",columnDefinition = "json")
    private  String packageWeight  ;


    public String getPackageDimensions() {
        return packageDimensions;
    }

    public void setPackageDimensions(String packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    //@Type(type="json")
    @Column(name="packagedimensions",columnDefinition = "json")
    private String packageDimensions ;

    @Column(name="packagecontent")
    private String packageContent  ;
    @Column(name="packagepiececount")
    private String packagePieceCount  ;
    @Column(name="declaredvaluecurrency")
    private String declaredValueCurrency  ;
    @Column(name="declaredvalueamount")
    private Double declaredValueAmount;
    //@Type(type="json")
    @Column(name="dateandtime",columnDefinition = "json")
    private String dateAndTimes  ;


    @Column(name="requestedappointmentdate")
    private String requestedAppointmentDate   ;

    @Column(name="requestedappointmentwindowbegins")
    private String requestedAppointmentWindowBegins;
    @Column(name="requestedappointmentwindowends")
    private String requestedappointmentwindowends;

    public String getRequestedappointmentwindowends() {
        return requestedappointmentwindowends;
    }

    public void setRequestedappointmentwindowends(String requestedappointmentwindowends) {
        this.requestedappointmentwindowends = requestedappointmentwindowends;
    }

    public String getRequestedAppointmentWindowBegins() {
        return requestedAppointmentWindowBegins;
    }

    public void setRequestedAppointmentWindowBegins(String requestedAppointmentWindowBegins) {
        this.requestedAppointmentWindowBegins = requestedAppointmentWindowBegins;
    }



    @Column(name="customdeliveryoptionsdescription")
    private String customDeliveryOptionsdescription  ;
    @Column(name="custom_deliveryoptionstype")
    private String customDeliveryOptionsType  ;
    @Column(name="customdeliveryoptionsstatus")
    private String customDeliveryOptionsStatus  ;
    @Column(name="holdlocationd")
    private String holdLocationID  ;
    @Column(name="holdlocationpersonname")
    private String holdLocationpersonName ;
    @Column(name="holdlocationphonenumber")
    private String holdLocationphoneNumber;
    @Column(name="holdlocationcompanyname")
    private String holdLocationCompanyName;
    @Column(name="holdlocationaddressclassification")
    private String holdLocationaddressClassification  ;
    @Column(name="holdlocationresidential")
    private Boolean holdLocationResidential  ;
    @Column(name="holdlocationstreetlines")
    private String holdLocationstreetLines  ;
    @Column(name="holdlocationcity")
    private String holdLocationCity  ;
    @Column(name="holdlocationurbanizationcode")
    private String holdLocationurbanizationCode  ;
    @Column(name="holdlocationstateorprovincecode")
    private String holdLocationstateOrProvinceCode  ;
    @Column(name="holdlocationpostalcode")
    private String holdLocationpostalCode  ;
    @Column(name="holdlocationcountrycode")
    private String holdLocationcountryCode  ;
    @Column(name="holdlocationcountryname")
    private String holdLocationcountryName  ;
    @Column(name="holdlocationtype")
    private String holdLocationType  ;
    @Column(name="estimateddeliverytimedescription")
    private String estimatedDeliveryTimeDescription  ;
    @Column(name="estimateddeliverytimewindowbegins")
    private String estimatedDeliveryTimeWindowbegins  ;
    @Column(name="estimateddeliverytimewindowends")
    private String estimatedDeliveryTimeWindowends  ;
    @Column(name="estimateddeliverytimewindowtype")
    private String estimatedDeliveryTimeWindowType  ;
    @Column(name="piececounts",columnDefinition = "json")
    private  String pieceCounts;


    @Column(name="originlocationid")
    private String originLocationId  ;
    @Column(name="originlocationpersonname")
    private String originLocationPersonName  ;
    @Column(name="originlocationphonenumber")
    private String originLocationPhoneNumber  ;
    @Column(name="originlocationcompanyname")
    private String originLocationCompanyName  ;
    @Column(name="originlocationaddressclassification")
    private String  originLocationAddressClassification  ;
    @Column(name="originlocationresidential")
    private boolean originLocationResidential   ;
    @Column(name="originlocationstreetlines")
    private String originLocationStreetLines  ;
    @Column(name="originlocationcity")
    private String originLocationCity  ;
    @Column(name="originlocationurbanizationcode")
    private String originLocationUrbanizationCode  ;
    @Column(name="originlocationstateorprovincecode")
    private String originLocationStateOrProvinceCode  ;
    @Column(name="originlocationpostalcode")
    private String originLocationPostalCode  ;
    @Column(name="originlocationcountrycode")
    private String originLocationcountryCode  ;
    @Column(name="originlocationcountryname")
    private String originLocationCountryName  ;
    @Column(name="originlocationtype")
    private String originLocationType  ;
    @Column(name="recipientpersonname")
    private String recipientPersonName  ;
    @Column(name="recipientphonenumber")
    private String recipientPhoneNumber  ;
    @Column(name="recipientcompanyname")
    private String recipientCompanyName  ;
    @Column(name="recipientaddressclassification")
    private String recipientAddressClassification  ;
    @Column(name="recipientresidential")
    private boolean recipientResidential   ;
    @Column(name="recipientstreetlines")
    private String recipientStreetLines  ;
    @Column(name="recipientcity")
    private String recipientCity  ;
    @Column(name="recipienturbanizationcode")
    private String recipientUrbanizationCode  ;
    @Column(name="recipientstateorprovincecode")
    private String recipientStateOrProvinceCode  ;
    @Column(name="recipientpostalcode")
    private String recipientPostalCode  ;
    @Column(name="recipientcountrycode")
    private String recipientCountryCode  ;
    @Column(name="recipientcountryname")
    private String recipientCountryName  ;
    @Column(name="stdtransittimewindowdescription")
    private String stdTransitTimeWindowDescription  ;
    @Column(name="stdtransittimewindowbegins")

    private String stdTransitTimeWindowBegins  ;
    @Column(name="stdtransittimewindowends")
    private String stdTransitTimeWindowEnds  ;
    @Column(name="stdtransittimewindowtype")
    private String stdTransitTimeWindowType  ;
    @Column(name="shipmentcontentitemnumber")
    private String shipmentContentItemNumber   ;
    @Column(name="shipmentcontentreceivedquantity")
    private String shipmentContentReceivedQuantity   ;
    @Column(name="shipmentcontentdescription")
    private String shipmentContentdescription   ;
    @Column(name="shipmentcontentpartnumber")
    private String shipmentContentPartNumber   ;
    @Column(name="shipmentbeforepossessionstatus")
    private boolean shipmentbeforePossessionStatus   ;
    @Column(name="shipmentweight",columnDefinition = "json")
    private String shipmentWeight   ;

    @Column(name="shipmentcontentpiececount")
    private String shipmentcontentPieceCount  ;
    @Column(name="splitshipmentspiececount")
    private String  splitShipmentsPieceCount ;
    @Column(name="splitshipmentsstatusdesp")
    private String  splitShipmentsStatusDesp ;
    @Column(name="splitshipmentstimestamp")
    private String  splitShipmentstimeStamp ;
    @Column(name="splitshipmentsstatuscode")
    private String  splitShipmentsStatusCode ;
    @Column(name="reasondetaildescription")
    private String reasonDetailDescription  ;
    @Column(name="reasondetailtype")
    private String reasonDetailType  ;
    @Column(name="availablenotifications")
    private String availableNotifications  ;

    @Column(name="shippercontactpersonname")
    private String shipperContactPersonName;
    @Column(name="shippercontactphonenumber")
    private String shipperContactPhoneNumber;
    @Column(name = "shippercontactcompanyname")
    private String shipperContactCompanyName;

    public String getShipperContactPersonName() {
        return shipperContactPersonName;
    }

    public void setShipperContactPersonName(String shipperContactPersonName) {
        this.shipperContactPersonName = shipperContactPersonName;
    }

    public String getShipperContactPhoneNumber() {
        return shipperContactPhoneNumber;
    }

    public void setShipperContactPhoneNumber(String shipperContactPhoneNumber) {
        this.shipperContactPhoneNumber = shipperContactPhoneNumber;
    }

    public String getShipperContactCompanyName() {
        return shipperContactCompanyName;
    }

    public void setShipperContactCompanyName(String shipperConactCompanyName) {
        this.shipperContactCompanyName = shipperConactCompanyName;
    }

    @Column(name="shipperaddressclassification")
    private String shipperAddressClassification  ;
    @Column(name="shipperresidential")
    private boolean shipperResidential   ;
    @Column(name="shipperstreetlines")
    private String shipperStreetLines  ;
    @Column(name="shippercity")
    private String shipperCity  ;
    @Column(name="shipperurbanizationcode")
    private String shipperUrbanizationCode  ;
    @Column(name="shipperstateorprovincecode")
    private String shipperStateOrProvinceCode  ;
    @Column(name="shipperpostalcode")
    private String shipperPostalCode  ;
    @Column(name="shippercountrycode")
    private String shipperCountryCode  ;
    @Column(name="shippercountryname")
    private String shipperCountryName  ;
    @Column(name="lastupdateddestinationaddressclassification")
    private String lastUpdatedDestinationAddressClassification  ;
    @Column(name="lastupdateddestinationaddressresidential")
    private boolean lastUpdatedDestinationAddressResidential   ;
    @Column(name="lastupdateddestinationaddressstreetlines")
    private String lastUpdatedDestinationAddressStreetLines  ;
    @Column(name="lastupdateddestinationaddresscity")
    private String lastUpdatedDestinationAddressCity  ;
    @Column(name="lastupdateddestinationaddressurbanizationcode")
    private String lastUpdatedDestinationAddressUrbanizationCode  ;
    @Column(name="lastupdateddestinationaddressstateorprovincecode")
    private String lastUpdatedDestinationAddressStateOrProvinceCode  ;
    @Column(name="lastupdateddestinationaddresspostalcode")
    private String lastUpdatedDestinationAddressPostalCode  ;
    @Column(name="lastupdateddestinationaddresscountrycode")
    private String lastUpdatedDestinationAddressCountryCode  ;
    @Column(name="lastupdateddestinationaddresscountryname")
    private String lastUpdatedDestinationAddressCountryName ;
    @Column(name="alerts")
    private String alerts;

    public String getTransitTimeServiceType() {
        return transitTimeServiceType;
    }

    public void setTransitTimeServiceType(String transitTimeServiceType) {
        this.transitTimeServiceType = transitTimeServiceType;
    }



    public String getTransitTimeCustomerMessage() {
        return transitTimeCustomerMessage;
    }

    public void setTransitTimeCustomerMessage(String transitTimeCustomerMessage) {
        this.transitTimeCustomerMessage = transitTimeCustomerMessage;
    }

    public String getTransitTimeDistance() {
        return transitTimeDistance;
    }

    public void setTransitTimeDistance(String transitTimeDistance) {
        this.transitTimeDistance = transitTimeDistance;
    }

    public String getBrokerCommitTimestamp() {
        return brokerCommitTimestamp;
    }

    public void setBrokerCommitTimestamp(String brokerCommitTimestamp) {
        this.brokerCommitTimestamp = brokerCommitTimestamp;
    }

    public String getCommitCutOffTime() {
        return commitCutOffTime;
    }

    public void setCommitCutOffTime(String commitCutOffTime) {
        this.commitCutOffTime = commitCutOffTime;
    }

    public String getCommitCommodityName() {
        return commitCommodityName;
    }

    public void setCommitCommodityName(String commitCommodityName) {
        this.commitCommodityName = commitCommodityName;
    }

    public String getCommitTransitDays() {
        return commitTransitDays;
    }

    public void setCommitTransitDays(String commitTransitDays) {
        this.commitTransitDays = commitTransitDays;
    }

    public String getCommitMessageDetails() {
        return commitMessageDetails;
    }

    public void setCommitMessageDetails(String commitMessageDetails) {
        this.commitMessageDetails = commitMessageDetails;
    }

    public String getDerivedDestinationServiceArea() {
        return derivedDestinationServiceArea;
    }

    public void setDerivedDestinationServiceArea(String derivedDestinationServiceArea) {
        this.derivedDestinationServiceArea = derivedDestinationServiceArea;
    }

    public String getDerivedDestinationCountryCode() {
        return derivedDestinationCountryCode;
    }

    public void setDerivedDestinationCountryCode(String derivedDestinationCountryCode) {
        this.derivedDestinationCountryCode = derivedDestinationCountryCode;
    }

    public String getDerivedDestinationLocationId() {
        return derivedDestinationLocationId;
    }

    public void setDerivedDestinationLocationId(String derivedDestinationLocationId) {
        this.derivedDestinationLocationId = derivedDestinationLocationId;
    }

    public String getDerivedDestinationAirportId() {
        return derivedDestinationAirportId;
    }

    public void setDerivedDestinationAirportId(String derivedDestinationAirportId) {
        this.derivedDestinationAirportId = derivedDestinationAirportId;
    }

    public String getDerivedDestinationPostalCode() {
        return derivedDestinationPostalCode;
    }

    public void setDerivedDestinationPostalCode(String derivedDestinationPostalCode) {
        this.derivedDestinationPostalCode = derivedDestinationPostalCode;
    }

    public String getDerivedDestinationStateOrProvinceCode() {
        return derivedDestinationStateOrProvinceCode;
    }

    public void setDerivedDestinationStateOrProvinceCode(String derivedDestinationStateOrProvinceCode) {
        this.derivedDestinationStateOrProvinceCode = derivedDestinationStateOrProvinceCode;
    }

    public int getDerivedDestinationLocationNumber() {
        return derivedDestinationLocationNumber;
    }

    public void setDerivedDestinationLocationNumber(int derivedDestinationLocationNumber) {
        this.derivedDestinationLocationNumber = derivedDestinationLocationNumber;
    }

    public String getTransitTimeDateDetail() {
        return transitTimeDateDetail;
    }

    public void setTransitTimeDateDetail(String transitTimeDateDetail) {
        this.transitTimeDateDetail = transitTimeDateDetail;
    }

    public String getTransitTimeGeoPositionalCoordinates() {
        return transitTimeGeoPositionalCoordinates;
    }

    public void setTransitTimeGeoPositionalCoordinates(String transitTimeGeoPositionalCoordinates) {
        this.transitTimeGeoPositionalCoordinates = transitTimeGeoPositionalCoordinates;
    }

    public String getTransitTimeServiceName() {
        return transitTimeServiceName;
    }

    public void setTransitTimeServiceName(String transitTimeServiceName) {
        this.transitTimeServiceName = transitTimeServiceName;
    }

    public boolean isEncoded() {
        return encoded;
    }

    public void setEncoded(boolean encoded) {
        this.encoded = encoded;
    }

    @Column(name="transittimeservicetype")
    private String transitTimeServiceType;


    @Column(name="transittimecustomermessage",columnDefinition = "json")
    private String transitTimeCustomerMessage;

    @Column(name="transittimedistance",columnDefinition = "json")
    private String transitTimeDistance;
    @Column(name="brokercommittimestamp")
    private String brokerCommitTimestamp;
    @Column(name="commitcutofftime")
    private String commitCutOffTime;

    @Column(name="commitcommodityname")
    private String commitCommodityName;

    @Column(name="committransitdays",columnDefinition = "json")
    private String commitTransitDays;

    @Column(name="commitmessagedetails")
    private String commitMessageDetails;

    @Column(name="deriveddestinationservicearea")
    private String derivedDestinationServiceArea;
    @Column(name="deriveddestinationcountrycode")
    private String derivedDestinationCountryCode;
    @Column(name="deriveddestinationlocationid")
    private String derivedDestinationLocationId;
    @Column(name="deriveddestinationairportid")
    private String derivedDestinationAirportId;
    @Column(name="deriveddestinationpostalcode")
    private String derivedDestinationPostalCode;
    @Column(name="deriveddestinationstateorprovincecode")
    private String derivedDestinationStateOrProvinceCode;
    @Column(name="deriveddestinationlocationnumber")
    private int derivedDestinationLocationNumber;

    @Column(name="transittimedatedetail",columnDefinition = "json")
    private String transitTimeDateDetail;

    @Column(name="transittimegeopositionalcoordinates")
    private String transitTimeGeoPositionalCoordinates;

    @Column(name="transittimeservicename")
    private String transitTimeServiceName;

    @Column(name="encoded")
    private boolean encoded;





}
