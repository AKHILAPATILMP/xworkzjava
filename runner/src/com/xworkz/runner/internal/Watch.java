package com.xworkz.runner.internal;

public class Watch {
    private String brand;
    private String type; // e.g., Analog, Digital, Smart
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}
