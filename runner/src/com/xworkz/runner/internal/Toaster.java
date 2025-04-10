package com.xworkz.runner.internal;

public class Toaster {
    private int slots;
    private String brand;
    private double price;

    public Toaster(int slots, String brand, double price) {
        this.slots = slots;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[slots=" + slots + ", brand=" + brand + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 5910;
    }
}
