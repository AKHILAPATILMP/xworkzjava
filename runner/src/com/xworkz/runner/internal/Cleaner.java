package com.xworkz.runner.internal;

public class Cleaner {
    private String brand;
    private String type; // e.g., Vacuum, Liquid
    private double price;

    public Cleaner(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}
