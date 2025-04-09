package com.xworkz.runner.internal;

public class Router {
    private String brand;
    private int speedMbps; // speed in Mbps
    private double price;

    public Router(String brand, int speedMbps, double price) {
        this.brand = brand;
        this.speedMbps = speedMbps;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", speed=" + speedMbps + " Mbps, price=" + price + "]";
    }
}
