package com.xworkz.runner.internal;

public class Laughter {
    private String source;
    private int durationInSeconds;
    private boolean contagious;

    public Laughter(String source, int durationInSeconds, boolean contagious) {
        this.source = source;
        this.durationInSeconds = durationInSeconds;
        this.contagious = contagious;
    }

    @Override
    public String toString() {
        return "[source=" + source + ", durationInSeconds=" + durationInSeconds + ", contagious=" + contagious + "]";
    }
}
