package com.example.fedexdemo1.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeightAndDimensions {
    @JsonProperty("weight")
    private Packageweight[] weight;
    @JsonProperty("dimensions")
    private PackageDimensions[] dimensions;

    public Packageweight[] getWeight() {
        return weight;
    }

    public void setWeight(Packageweight[] weight) {
        this.weight = weight;
    }

    public PackageDimensions[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(PackageDimensions[] dimensions) {
        this.dimensions = dimensions;
    }
}
