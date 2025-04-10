package com.xworkz.runner.internal;

public class Metro {
    private String city;
    private int numberOfStations;
    private double ticketFare;

    public Metro(String city, int numberOfStations, double ticketFare) {
        this.city = city;
        this.numberOfStations = numberOfStations;
        this.ticketFare = ticketFare;
    }

    @Override
    public String toString() {
        return "[city=" + city + ", numberOfStations=" + numberOfStations + ", ticketFare=" + ticketFare + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 432;
    }
}
