package com.xworkz.runner.internal;

public class Heater {
    private String brand;
    private String type; // e.g., Water, Room
    private double price;

    public Heater(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}
