package com.xworkz.runner.internal;

public class Recliner {
    private String material;
    private String color;
    private double price;

    public Recliner(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", price=" + price + "]";
    }
}
