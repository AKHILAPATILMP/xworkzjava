package com.xworkz.runner.internal;

public class Futon {
    private String material;
    private String size;
    private double cost;

    public Futon(String material, String size, double cost) {
        this.material = material;
        this.size = size;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", cost=" + cost + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 909;
    }
}
