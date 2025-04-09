package com.xworkz.runner.internal;

public class Star {
    private String constellation;
    private double brightness;
    private int distanceInLightYears;

    public Star(String constellation, double brightness, int distanceInLightYears) {
        this.constellation = constellation;
        this.brightness = brightness;
        this.distanceInLightYears = distanceInLightYears;
    }

    @Override
    public String toString() {
        return "[constellation=" + constellation + ", brightness=" + brightness + ", distanceInLightYears=" + distanceInLightYears + "]";
    }
}
