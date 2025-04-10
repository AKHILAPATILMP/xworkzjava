package com.xworkz.runner.internal;

public class Bus {
    private String company;
    private int capacity;
    private double fare;

    public Bus(String company, int capacity, double fare) {
        this.company = company;
        this.capacity = capacity;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "[company=" + company + ", capacity=" + capacity + ", fare=" + fare + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 888;
    }
}
