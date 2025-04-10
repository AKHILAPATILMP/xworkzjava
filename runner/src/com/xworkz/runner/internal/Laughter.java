package com.xworkz.runner.internal;

public class Laughter {
    private String type;
    private String cause;
    private double decibelLevel;

    public Laughter(String type, String cause, double decibelLevel) {
        this.type = type;
        this.cause = cause;
        this.decibelLevel = decibelLevel;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", cause=" + cause + ", decibelLevel=" + decibelLevel + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 888;
    }
}
