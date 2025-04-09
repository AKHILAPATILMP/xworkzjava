package com.xworkz.runner.internal;

public class Rose {
    private String color;
    private double fragranceLevel; // scale of 1.0 to 10.0
    private boolean hasThorns;

    public Rose(String color, double fragranceLevel, boolean hasThorns) {
        this.color = color;
        this.fragranceLevel = fragranceLevel;
        this.hasThorns = hasThorns;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", fragranceLevel=" + fragranceLevel + ", hasThorns=" + hasThorns + "]";
    }
}
