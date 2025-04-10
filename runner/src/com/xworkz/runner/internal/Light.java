package com.xworkz.runner.internal;

public class Light {
    private String type;
    private String color;
    private int brightness;

    public Light(String type, String color, int brightness) {
        this.type = type;
        this.color = color;
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", color=" + color + ", brightness=" + brightness + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 789;
    }
}
