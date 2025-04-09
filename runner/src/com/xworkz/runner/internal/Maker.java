package com.xworkz.runner.internal;

public class Maker {
    private String name; // e.g., Coffee Maker
    private int capacity; // in cups
    private double price;

    public Maker(String name, int capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", capacity=" + capacity + " cups, price=" + price + "]";
    }
}
