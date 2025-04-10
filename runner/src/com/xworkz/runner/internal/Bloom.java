package com.xworkz.runner.internal;

public class Bloom {
    private String flowerType;
    private String season;
    private double fragranceLevel;

    public Bloom(String flowerType, String season, double fragranceLevel) {
        this.flowerType = flowerType;
        this.season = season;
        this.fragranceLevel = fragranceLevel;
    }

    @Override
    public String toString() {
        return "[flowerType=" + flowerType + ", season=" + season + ", fragranceLevel=" + fragranceLevel + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 456;
    }
}
