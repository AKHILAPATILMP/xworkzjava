package com.xworkz.runner.internal;

public class Taste {
    private String flavor;
    private int intensityLevel;
    private boolean isSweet;

    public Taste(String flavor, int intensityLevel, boolean isSweet) {
        this.flavor = flavor;
        this.intensityLevel = intensityLevel;
        this.isSweet = isSweet;
    }

    @Override
    public String toString() {
        return "[flavor=" + flavor + ", intensityLevel=" + intensityLevel + ", isSweet=" + isSweet + "]";
    }

}
