package com.xworkz.runner.internal;

public class Flight {
    private String airline;
    private double altitude;
    private int durationInMinutes;

    public Flight(String airline, double altitude, int durationInMinutes) {
        this.airline = airline;
        this.altitude = altitude;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "[airline=" + airline + ", altitude=" + altitude + " ft, duration=" + durationInMinutes + " mins]";
    }
}
