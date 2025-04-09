package com.xworkz.runner.internal;

public class Rhythm {
    private String pattern;
    private int bpm; // beats per minute
    private boolean isSyncopated;

    public Rhythm(String pattern, int bpm, boolean isSyncopated) {
        this.pattern = pattern;
        this.bpm = bpm;
        this.isSyncopated = isSyncopated;
    }

    @Override
    public String toString() {
        return "[pattern=" + pattern + ", bpm=" + bpm + ", isSyncopated=" + isSyncopated + "]";
    }
}
