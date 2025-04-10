package com.xworkz.runner.internal;

public class Box {
    private String material;
    private String color;
    private double volume;

    public Box(String material, String color, double volume) {
        this.material = material;
        this.color = color;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", volume=" + volume + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 789;
    }
}
