package com.xworkz.runner.internal;

public class Stool {
    private String material;
    private int height;
    private double price;

    public Stool(String material, int height, double price) {
        this.material = material;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", height=" + height + "cm, price=" + price + "]";
    }
}
