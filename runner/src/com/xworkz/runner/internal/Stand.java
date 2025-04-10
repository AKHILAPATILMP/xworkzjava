package com.xworkz.runner.internal;

public class Stand {
    private String type;
    private String material;
    private double height;

    public Stand(String type, String material, double height) {
        this.type = type;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", material=" + material + ", height=" + height + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 560;
    }
}
