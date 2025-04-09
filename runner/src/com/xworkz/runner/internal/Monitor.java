package com.xworkz.runner.internal;

public class Monitor {
    private String brand;
    private int size; // in inches
    private double price;

    public Monitor(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", size=" + size + " inches, price=" + price + "]";
    }
}
