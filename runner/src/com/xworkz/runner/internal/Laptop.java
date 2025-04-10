package com.xworkz.runner.internal;

public class Laptop {
    private String brand;
    private String processor;
    private double price;

    public Laptop(String brand, String processor, double price) {
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", processor=" + processor + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 707;
    }
}
