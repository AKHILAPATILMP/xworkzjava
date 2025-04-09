package com.xworkz.runner.internal;

public class Moon {
    private String phase;
    private boolean visible;
    private double surfaceTemperature;

    public Moon(String phase, boolean visible, double surfaceTemperature) {
        this.phase = phase;
        this.visible = visible;
        this.surfaceTemperature = surfaceTemperature;
    }

    @Override
    public String toString() {
        return "[phase=" + phase + ", visible=" + visible + ", surfaceTemperature=" + surfaceTemperature + "]";
    }
}
