package com.xworkz.runner.internal;

public class Desk {
    private String material;
    private String shape;
    private double height;

    public Desk(String material, String shape, double height) {
        this.material = material;
        this.shape = shape;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", shape=" + shape + ", height=" + height + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 333;
    }
}
