package com.xworkz.runner.internal;

public class Camera {
    private String brand;
    private int megapixels;
    private double price;

    public Camera(String brand, int megapixels, double price) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", megapixels=" + megapixels + "MP, price=" + price + "]";
    }
}
