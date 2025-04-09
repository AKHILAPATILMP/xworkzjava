package com.xworkz.runner.internal;

public class Metro {
    private String lineName;
    private int coaches;
    private double fare;

    public Metro(String lineName, int coaches, double fare) {
        this.lineName = lineName;
        this.coaches = coaches;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "[lineName=" + lineName + ", coaches=" + coaches + ", fare=" + fare + "]";
    }
}
