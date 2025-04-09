package com.xworkz.runner.internal;

public class Journey {
    private String meaning;
    private String symbolism;
    private double intensity;

    public Journey(String meaning, String symbolism, double intensity) {
        this.meaning = meaning;
        this.symbolism = symbolism;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "[meaning=" + meaning + ", symbolism=" + symbolism + ", intensity=" + intensity + "]";
    }
}
