package com.xworkz.runner.internal;

public class Truck {
    private String model;
    private double loadCapacity;
    private String fuelType;

    public Truck(String model, double loadCapacity, String fuelType) {
        this.model = model;
        this.loadCapacity = loadCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", loadCapacity=" + loadCapacity + ", fuelType=" + fuelType + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 7744;
    }
}
