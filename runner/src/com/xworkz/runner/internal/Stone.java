package com.xworkz.runner.internal;

public class Stone {
    private String type;
    private double weight;
    private String origin;

    public Stone(String type, double weight, String origin) {
        this.type = type;
        this.weight = weight;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", weight=" + weight + " kg, origin=" + origin + "]";
    }
}
