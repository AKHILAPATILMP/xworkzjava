package com.xworkz.runner.internal;

public class Scooter {
    private String brand;
    private String color;
    private double mileage;

    public Scooter(String brand, String color, double mileage) {
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", color=" + color + ", mileage=" + mileage + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 507;
    }
}
