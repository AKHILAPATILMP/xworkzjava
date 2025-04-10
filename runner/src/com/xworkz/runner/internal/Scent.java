package com.xworkz.runner.internal;

public class Scent {
    private String name;
    private String category;
    private double concentration;

    public Scent(String name, String category, double concentration) {
        this.name = name;
        this.category = category;
        this.concentration = concentration;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", category=" + category + ", concentration=" + concentration + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 506;
    }
}
