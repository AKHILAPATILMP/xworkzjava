package com.xworkz.runner.internal;

public class Ship {
    private String name;
    private double length;
    private String purpose;

    public Ship(String name, double length, String purpose) {
        this.name = name;
        this.length = length;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", length=" + length + ", purpose=" + purpose + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 510;
    }
}
