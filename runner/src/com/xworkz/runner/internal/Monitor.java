package com.xworkz.runner.internal;

public class Monitor {
    private String brand;
    private int size;
    private double price;

    public Monitor(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", size=" + size + " inch, price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 678;
    }
}
