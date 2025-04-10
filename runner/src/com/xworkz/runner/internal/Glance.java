package com.xworkz.runner.internal;

public class Glance {
    private String direction;
    private int durationInSeconds;
    private boolean meaningful;

    public Glance(String direction, int durationInSeconds, boolean meaningful) {
        this.direction = direction;
        this.durationInSeconds = durationInSeconds;
        this.meaningful = meaningful;
    }

    @Override
    public String toString() {
        return "[direction=" + direction + ", durationInSeconds=" + durationInSeconds + ", meaningful=" + meaningful + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 777;
    }
}
