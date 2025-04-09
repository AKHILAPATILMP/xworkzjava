package com.xworkz.runner.internal;

public class Helicopter {
    private String model;
    private int capacity;
    private double price;

    public Helicopter(String model, int capacity, double price) {
        this.model = model;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", capacity=" + capacity + ", price=" + price + "]";
    }
}
