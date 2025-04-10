package com.xworkz.runner.internal;

public class Velvet {
    private String color;
    private double pricePerMeter;
    private String origin;

    public Velvet(String color, double pricePerMeter, String origin) {
        this.color = color;
        this.pricePerMeter = pricePerMeter;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", pricePerMeter=" + pricePerMeter + ", origin=" + origin + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 3001;
    }
}
