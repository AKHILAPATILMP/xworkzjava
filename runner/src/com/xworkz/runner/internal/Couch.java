package com.xworkz.runner.internal;

public class Couch {
    private String material;
    private int seatingCapacity;
    private double price;

    public Couch(String material, int seatingCapacity, double price) {
        this.material = material;
        this.seatingCapacity = seatingCapacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", seatingCapacity=" + seatingCapacity + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 943;
    }
}
