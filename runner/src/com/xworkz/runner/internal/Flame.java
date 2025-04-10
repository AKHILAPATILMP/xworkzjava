package com.xworkz.runner.internal;

public class Flame {
    private String color;
    private int temperature;
    private String fuelSource;

    public Flame(String color, int temperature, String fuelSource) {
        this.color = color;
        this.temperature = temperature;
        this.fuelSource = fuelSource;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", temperature=" + temperature + ", fuelSource=" + fuelSource + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 606;
    }
}
