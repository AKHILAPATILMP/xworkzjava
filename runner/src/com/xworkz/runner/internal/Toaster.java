package com.xworkz.runner.internal;

public class Toaster {
    private String brand;
    private int sliceCapacity;
    private double price;

    public Toaster(String brand, int sliceCapacity, double price) {
        this.brand = brand;
        this.sliceCapacity = sliceCapacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", sliceCapacity=" + sliceCapacity + ", price=" + price + "]";
    }
}
