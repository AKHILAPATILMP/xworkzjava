package com.xworkz.runner.internal;

public class Recliner {
    private String brand;
    private String material;
    private double cost;

    public Recliner(String brand, String material, double cost) {
        this.brand = brand;
        this.material = material;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", material=" + material + ", cost=" + cost + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 888;
    }
}
