package com.xworkz.runner.internal;

public class Mountain {
    private String name;
    private double height;
    private String location;

    public Mountain(String name, double height, String location) {
        this.name = name;
        this.height = height;
        this.location = location;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", height=" + height + " m, location=" + location + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 847;
    }
}
