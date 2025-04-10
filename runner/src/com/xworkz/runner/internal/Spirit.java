package com.xworkz.runner.internal;

public class Spirit {
    private String type;
    private String origin;
    private double intensity;

    public Spirit(String type, String origin, double intensity) {
        this.type = type;
        this.origin = origin;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", origin=" + origin + ", intensity=" + intensity + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 550;
    }
}
