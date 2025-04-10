package com.xworkz.runner.internal;

public class TVStand {
    private String material;
    private int shelves;
    private double price;

    public TVStand(String material, int shelves, double price) {
        this.material = material;
        this.shelves = shelves;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", shelves=" + shelves + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 1105;
    }
}
