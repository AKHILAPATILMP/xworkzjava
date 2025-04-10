package com.xworkz.runner.internal;

public class Decay {
    private String type;
    private String cause;
    private double rate;

    public Decay(String type, String cause, double rate) {
        this.type = type;
        this.cause = cause;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", cause=" + cause + ", rate=" + rate + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 222;
    }
}
