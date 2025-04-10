package com.xworkz.runner.internal;

public class Forest {
    private String name;
    private String location;
    private double area;

    public Forest(String name, String location, double area) {
        this.name = name;
        this.location = location;
        this.area = area;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", location=" + location + ", area=" + area + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 606;
    }
}
