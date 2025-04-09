package com.xworkz.runner.internal;

public class Decay {
    private String materialType;
    private double decayRate;
    private int ageInYears;

    public Decay(String materialType, double decayRate, int ageInYears) {
        this.materialType = materialType;
        this.decayRate = decayRate;
        this.ageInYears = ageInYears;
    }

    @Override
    public String toString() {
        return "[materialType=" + materialType + ", decayRate=" + decayRate + ", ageInYears=" + ageInYears + "]";
    }
}
