package com.xworkz.runner.internal;

public class Sun {
    private String color;
    private double temperature;
    private boolean isRising;

    public Sun(String color, double temperature, boolean isRising) {
        this.color = color;
        this.temperature = temperature;
        this.isRising = isRising;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", temperature=" + temperature + ", isRising=" + isRising + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 813;
    }
}
