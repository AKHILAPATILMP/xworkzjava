package com.xworkz.runner.internal;

public class Box {
    private String material;
    private String size;
    private double price;

    public Box(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", price=" + price + "]";
    }
}
