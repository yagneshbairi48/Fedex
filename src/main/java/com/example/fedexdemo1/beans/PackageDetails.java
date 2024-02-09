package com.example.fedexdemo1.beans;

public class PackageDetails {
    private  String physicalPackagingType;
    private String sequenceNumber;
    private String undeliveredCount;
    private PackagingDescription packagingDescription;

    private String count;
    private WeightAndDimensions weightAndDimensions;
    private String[] packageContent;
    private String contentPieceCount;
    private DeclaredValue declaredValue;

    public String getPhysicalPackagingType() {
        return physicalPackagingType;
    }

    public void setPhysicalPackagingType(String physicalPackagingType) {
        this.physicalPackagingType = physicalPackagingType;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getUndeliveredCount() {
        return undeliveredCount;
    }

    public void setUndeliveredCount(String undeliveredCount) {
        this.undeliveredCount = undeliveredCount;
    }

    public PackagingDescription getPackagingDescription() {
        return packagingDescription;
    }

    public void setPackagingDescription(PackagingDescription packagingDescription) {
        this.packagingDescription = packagingDescription;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public WeightAndDimensions getWeightAndDimensions() {
        return weightAndDimensions;
    }

    public void setWeightAndDimensions(WeightAndDimensions weightAndDimensions) {
        this.weightAndDimensions = weightAndDimensions;
    }

    public String[] getPackageContent() {
        return packageContent;
    }

    public void setPackageContent(String[] packageContent) {
        this.packageContent = packageContent;
    }

    public String getContentPieceCount() {
        return contentPieceCount;
    }

    public void setContentPieceCount(String contentPieceCount) {
        this.contentPieceCount = contentPieceCount;
    }

    public DeclaredValue getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(DeclaredValue declaredValue) {
        this.declaredValue = declaredValue;
    }
}
