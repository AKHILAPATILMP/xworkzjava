package com.xworkz.runner.internal;

public class Amber {
    private String type;
    private String origin;
    private double pricePerGram;

    public Amber(String type, String origin, double pricePerGram) {
        this.type = type;
        this.origin = origin;
        this.pricePerGram = pricePerGram;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", origin=" + origin + ", pricePerGram=" + pricePerGram + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 321;
    }
}
