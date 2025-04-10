package com.xworkz.runner.internal;

public class Helicopter {
    private String model;
    private String manufacturer;
    private int capacity;

    public Helicopter(String model, String manufacturer, int capacity) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", manufacturer=" + manufacturer + ", capacity=" + capacity + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 789;
    }
}
