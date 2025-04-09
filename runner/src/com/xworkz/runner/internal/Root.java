package com.xworkz.runner.internal;

public class Root {
    private String plantType;
    private double depth;
    private boolean absorbsWater;

    public Root(String plantType, double depth, boolean absorbsWater) {
        this.plantType = plantType;
        this.depth = depth;
        this.absorbsWater = absorbsWater;
    }

    @Override
    public String toString() {
        return "[plantType=" + plantType + ", depth=" + depth + " cm, absorbsWater=" + absorbsWater + "]";
    }
}
