package com.xworkz.runner.internal;

public class Cabinet {
    private String material;
    private int shelves;
    private double height;

    public Cabinet(String material, int shelves, double height) {
        this.material = material;
        this.shelves = shelves;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", shelves=" + shelves + ", height=" + height + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 456;
    }
}
