package com.xworkz.runner.internal;

public class Truth {
    private String belief;
    private boolean isUniversal;
    private int depth;

    public Truth(String belief, boolean isUniversal, int depth) {
        this.belief = belief;
        this.isUniversal = isUniversal;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "[belief=" + belief + ", isUniversal=" + isUniversal + ", depth=" + depth + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 9001;
    }
}
