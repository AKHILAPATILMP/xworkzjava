package com.xworkz.runner.internal;

public class River {
    private String name;
    private String continent;
    private double length;

    public River(String name, String continent, double length) {
        this.name = name;
        this.continent = continent;
        this.length = length;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", continent=" + continent + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 502;
    }
}
