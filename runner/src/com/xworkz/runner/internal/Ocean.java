package com.xworkz.runner.internal;

public class Ocean {
    private String name;
    private double depth;
    private double area;

    public Ocean(String name, double depth, double area) {
        this.name = name;
        this.depth = depth;
        this.area = area;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", depth=" + depth + "m, area=" + area + " sq km]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 888;
    }
}
