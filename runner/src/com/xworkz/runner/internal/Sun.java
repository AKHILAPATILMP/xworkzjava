package com.xworkz.runner.internal;

public class Sun {
    private double diameter;
    private String composition;
    private int solarFlares;

    public Sun(double diameter, String composition, int solarFlares) {
        this.diameter = diameter;
        this.composition = composition;
        this.solarFlares = solarFlares;
    }

    @Override
    public String toString() {
        return "[diameter=" + diameter + ", composition=" + composition + ", solarFlares=" + solarFlares + "]";
    }
}
