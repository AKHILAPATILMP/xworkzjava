package com.xworkz.runner.internal;

public class Scooter {
    private String brand;
    private String fuelType; // Petrol or Electric
    private double price;

    public Scooter(String brand, String fuelType, double price) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", fuelType=" + fuelType + ", price=" + price + "]";
    }
}
