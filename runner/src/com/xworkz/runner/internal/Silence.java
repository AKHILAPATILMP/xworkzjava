package com.xworkz.runner.internal;

public class Silence {
    private String type;
    private int durationInMinutes;
    private boolean calming;

    public Silence(String type, int durationInMinutes, boolean calming) {
        this.type = type;
        this.durationInMinutes = durationInMinutes;
        this.calming = calming;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", durationInMinutes=" + durationInMinutes + ", calming=" + calming + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 511;
    }
}
