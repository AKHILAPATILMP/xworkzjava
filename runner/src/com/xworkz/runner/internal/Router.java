package com.xworkz.runner.internal;

public class Router {
    private String brand;
    private int range;
    private boolean dualBand;

    public Router(String brand, int range, boolean dualBand) {
        this.brand = brand;
        this.range = range;
        this.dualBand = dualBand;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", range=" + range + ", dualBand=" + dualBand + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 505;
    }
}
