package com.xworkz.runner.internal;

public class Taste {
    private String flavor;
    private boolean isSweet;
    private int intensityLevel;

    public Taste(String flavor, boolean isSweet, int intensityLevel) {
        this.flavor = flavor;
        this.isSweet = isSweet;
        this.intensityLevel = intensityLevel;
    }

    @Override
    public String toString() {
        return "[flavor=" + flavor + ", isSweet=" + isSweet + ", intensityLevel=" + intensityLevel + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 1101;
    }
}
