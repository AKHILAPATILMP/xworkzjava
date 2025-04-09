package com.xworkz.runner.internal;

public class Amber {
    private String clarity;
    private int ageInMillionYears;
    private boolean hasInclusion;

    public Amber(String clarity, int ageInMillionYears, boolean hasInclusion) {
        this.clarity = clarity;
        this.ageInMillionYears = ageInMillionYears;
        this.hasInclusion = hasInclusion;
    }

    @Override
    public String toString() {
        return "[clarity=" + clarity + ", age=" + ageInMillionYears + " million years, hasInclusion=" + hasInclusion + "]";
    }
}
