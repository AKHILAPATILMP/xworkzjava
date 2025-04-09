package com.xworkz.runner.internal;

public class Bike {
    private String brand;
    private int engineCC;
    private double price;

    public Bike(String brand, int engineCC, double price) {
        this.brand = brand;
        this.engineCC = engineCC;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", engineCC=" + engineCC + "cc, price=" + price + "]";
    }
}
