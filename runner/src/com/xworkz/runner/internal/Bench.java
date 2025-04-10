package com.xworkz.runner.internal;

public class Bench {
    private String material;
    private int length;
    private double cost;

    public Bench(String material, int length, double cost) {
        this.material = material;
        this.length = length;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", length=" + length + ", cost=" + cost + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 456;
    }
}
