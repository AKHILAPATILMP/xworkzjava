package com.xworkz.runner.internal;

public class Journey {
    private String destination;
    private int durationInDays;
    private double cost;

    public Journey(String destination, int durationInDays, double cost) {
        this.destination = destination;
        this.durationInDays = durationInDays;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[destination=" + destination + ", durationInDays=" + durationInDays + ", cost=" + cost + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 404;
    }
}
