package com.xworkz.runner.internal;

public class Bike {
    private String brand;
    private String model;
    private double price;

    public Bike(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 789;
    }
}
