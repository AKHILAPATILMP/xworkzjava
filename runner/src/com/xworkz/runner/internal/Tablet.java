package com.xworkz.runner.internal;

public class Tablet {
    private String brand;
    private int screenSize; // in inches
    private double price;

    public Tablet(String brand, int screenSize, double price) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", screenSize=" + screenSize + " inches, price=" + price + "]";
    }
}
