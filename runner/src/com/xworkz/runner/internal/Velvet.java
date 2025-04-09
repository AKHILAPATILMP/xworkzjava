package com.xworkz.runner.internal;

public class Velvet {
    private String color;
    private double softnessLevel;
    private boolean isStretchable;

    public Velvet(String color, double softnessLevel, boolean isStretchable) {
        this.color = color;
        this.softnessLevel = softnessLevel;
        this.isStretchable = isStretchable;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", softnessLevel=" + softnessLevel + ", isStretchable=" + isStretchable + "]";
    }
}
