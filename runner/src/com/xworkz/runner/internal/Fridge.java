package com.xworkz.runner.internal;

public class Fridge {
    private String brand;
    private int capacity; // in liters
    private double price;

    public Fridge(String brand, int capacity, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + "L, price=" + price + "]";
    }
}
