package com.xworkz.runner.internal;

public class Flight {
    private String airline;
    private String destination;
    private double duration;

    public Flight(String airline, String destination, double duration) {
        this.airline = airline;
        this.destination = destination;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "[airline=" + airline + ", destination=" + destination + ", duration=" + duration + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 505;
    }
}
