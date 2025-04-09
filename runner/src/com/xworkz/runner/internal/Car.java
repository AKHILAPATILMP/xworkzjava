package com.xworkz.runner.internal;

public class Car {
    private String brand;
    private String fuelType;
    private double price;

    public Car(String brand, String fuelType, double price) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", fuelType=" + fuelType + ", price=" + price + "]";
    }
}
