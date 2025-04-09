package com.xworkz.runner.internal;

public class Conditioner {
    private String brand;
    private String type; // e.g., Hair, Fabric
    private double price;

    public Conditioner(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}
