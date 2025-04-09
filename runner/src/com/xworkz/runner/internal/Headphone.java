package com.xworkz.runner.internal;

public class Headphone {
    private String brand;
    private String type; // e.g., Over-ear, In-ear, Wireless
    private double price;

    public Headphone(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}
