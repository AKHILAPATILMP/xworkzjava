package com.xworkz.runner.internal;

public class Cupboard {
    private String material;
    private String color;
    private double price;

    public Cupboard(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", price=" + price + "]";
    }
}
