package com.xworkz.runner.internal;

public class Fridge {
    private String brand;
    private int capacity;
    private double price;

    public Fridge(String brand, int capacity, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 707;
    }
}
