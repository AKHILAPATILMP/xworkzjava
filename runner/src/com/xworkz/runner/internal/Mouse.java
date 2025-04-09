package com.xworkz.runner.internal;

public class Mouse {
    private String brand;
    private String type; // e.g., Wired, Wireless
    private double price;

    public Mouse(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}
