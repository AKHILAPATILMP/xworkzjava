package com.xworkz.runner.internal;

public class Bench {
    private String material;
    private String color;
    private double price;

    public Bench(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", price=" + price + "]";
    }
}
