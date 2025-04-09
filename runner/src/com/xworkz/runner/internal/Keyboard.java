package com.xworkz.runner.internal;

public class Keyboard {
    private String brand;
    private String type; // e.g., Mechanical, Membrane
    private double price;

    public Keyboard(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}
