package com.xworkz.runner.internal;

public class Heater {
    private String brand;
    private String type;
    private double powerRating;

    public Heater(String brand, String type, double powerRating) {
        this.brand = brand;
        this.type = type;
        this.powerRating = powerRating;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", powerRating=" + powerRating + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 432;
    }
}
