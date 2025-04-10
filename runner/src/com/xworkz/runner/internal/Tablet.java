package com.xworkz.runner.internal;

public class Tablet {
    private String brand;
    private double screenSize;
    private boolean supportsPen;

    public Tablet(String brand, double screenSize, boolean supportsPen) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.supportsPen = supportsPen;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", screenSize=" + screenSize + ", supportsPen=" + supportsPen + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 1001;
    }
}
