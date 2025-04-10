package com.xworkz.runner.internal;

public class Sofa {
    private String material;
    private String size;
    private double price;

    public Sofa(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 540;
    }
}
