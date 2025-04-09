package com.xworkz.runner.internal;

public class Truck {
    private String brand;
    private int loadCapacity; // in tons
    private double price;

    public Truck(String brand, int loadCapacity, double price) {
        this.brand = brand;
        this.loadCapacity = loadCapacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", loadCapacity=" + loadCapacity + " tons, price=" + price + "]";
    }
}
