package com.xworkz.runner.internal;

public class Dresser {
    private String material;
    private int drawers;
    private double height;

    public Dresser(String material, int drawers, double height) {
        this.material = material;
        this.drawers = drawers;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", drawers=" + drawers + ", height=" + height + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 888;
    }
}
