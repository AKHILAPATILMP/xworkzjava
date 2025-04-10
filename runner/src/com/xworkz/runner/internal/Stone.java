package com.xworkz.runner.internal;

public class Stone {
    private String color;
    private double weight;
    private String type;

    public Stone(String color, double weight, String type) {
        this.color = color;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", weight=" + weight + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 822;
    }
}
