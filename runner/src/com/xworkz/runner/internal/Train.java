package com.xworkz.runner.internal;

public class Train {
    private String name;
    private int coaches;
    private double fare;

    public Train(String name, int coaches, double fare) {
        this.name = name;
        this.coaches = coaches;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", coaches=" + coaches + ", fare=" + fare + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 4467;
    }
}
