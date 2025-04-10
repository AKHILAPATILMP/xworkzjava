package com.xworkz.runner.internal;

public class Stool {
    private String material;
    private int legs;
    private double height;

    public Stool(String material, int legs, double height) {
        this.material = material;
        this.legs = legs;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", legs=" + legs + ", height=" + height + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 611;
    }
}
