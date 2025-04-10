package com.xworkz.runner.internal;

public class Destiny {
    private String belief;
    private String origin;
    private boolean predetermined;

    public Destiny(String belief, String origin, boolean predetermined) {
        this.belief = belief;
        this.origin = origin;
        this.predetermined = predetermined;
    }

    @Override
    public String toString() {
        return "[belief=" + belief + ", origin=" + origin + ", predetermined=" + predetermined + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 444;
    }
}
