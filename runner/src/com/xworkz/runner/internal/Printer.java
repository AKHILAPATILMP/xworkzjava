package com.xworkz.runner.internal;

public class Printer {
    private String brand;
    private String type; // e.g., Inkjet, Laser
    private double price;

    public Printer(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}
