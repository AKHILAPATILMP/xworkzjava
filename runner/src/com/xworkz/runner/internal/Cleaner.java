package com.xworkz.runner.internal;

public class Cleaner {
    private String name;
    private String type;
    private double efficiency;

    public Cleaner(String name, String type, double efficiency) {
        this.name = name;
        this.type = type;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", type=" + type + ", efficiency=" + efficiency + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 555;
    }
}
