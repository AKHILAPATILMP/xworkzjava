package com.xworkz.runner.internal;

public class Bus {
    private String brand;
    private int seatingCapacity;
    private double price;

    public Bus(String brand, int seatingCapacity, double price) {
        this.brand = brand;
        this.seatingCapacity = seatingCapacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", seatingCapacity=" + seatingCapacity + ", price=" + price + "]";
    }
}
