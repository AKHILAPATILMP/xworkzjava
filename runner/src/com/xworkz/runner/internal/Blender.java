package com.xworkz.runner.internal;

public class Blender {
    private String brand;
    private int speedSettings;
    private double price;

    public Blender(String brand, int speedSettings, double price) {
        this.brand = brand;
        this.speedSettings = speedSettings;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", speedSettings=" + speedSettings + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 987;
    }
}
