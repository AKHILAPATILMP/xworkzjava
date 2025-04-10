package com.xworkz.runner.internal;

public class Printer {
    private String brand;
    private String type;
    private double price;

    public Printer(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 920;
    }
}
