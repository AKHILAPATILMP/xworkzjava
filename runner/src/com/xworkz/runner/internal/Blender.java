package com.xworkz.runner.internal;

public class Blender {
    private String brand;
    private int speedLevels;
    private double price;

    public Blender(String brand, int speedLevels, double price) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", speedLevels=" + speedLevels + ", price=" + price + "]";
    }
}
