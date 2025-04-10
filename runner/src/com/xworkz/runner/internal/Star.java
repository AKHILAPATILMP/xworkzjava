package com.xworkz.runner.internal;

public class Star {
    private String name;
    private double brightness;
    private String constellation;

    public Star(String name, double brightness, String constellation) {
        this.name = name;
        this.brightness = brightness;
        this.constellation = constellation;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", brightness=" + brightness + ", constellation=" + constellation + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 580;
    }
}
