package com.xworkz.runner.internal;

public class Maker {
    private String brand;
    private String type;
    private double cost;

    public Maker(String brand, String type, double cost) {
        this.brand = brand;
        this.type = type;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", cost=" + cost + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 432;
    }
}
