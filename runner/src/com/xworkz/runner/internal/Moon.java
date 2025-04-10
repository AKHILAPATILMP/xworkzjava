package com.xworkz.runner.internal;

public class Moon {
    private String phase;
    private double distanceFromEarth;
    private boolean visibleAtNight;

    public Moon(String phase, double distanceFromEarth, boolean visibleAtNight) {
        this.phase = phase;
        this.distanceFromEarth = distanceFromEarth;
        this.visibleAtNight = visibleAtNight;
    }

    @Override
    public String toString() {
        return "[phase=" + phase + ", distanceFromEarth=" + distanceFromEarth + " km, visibleAtNight=" + visibleAtNight + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 932;
    }
}
