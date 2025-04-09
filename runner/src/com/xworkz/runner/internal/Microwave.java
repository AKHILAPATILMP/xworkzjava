package com.xworkz.runner.internal;

public class Microwave {
    private String brand;
    private int power; // in watts
    private double price;

    public Microwave(String brand, int power, double price) {
        this.brand = brand;
        this.power = power;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", power=" + power + "W, price=" + price + "]";
    }
}
