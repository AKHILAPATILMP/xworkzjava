package com.xworkz.runner.internal;

public class Scent {
    private String note;
    private String source;
    private int longevityHours;

    public Scent(String note, String source, int longevityHours) {
        this.note = note;
        this.source = source;
        this.longevityHours = longevityHours;
    }

    @Override
    public String toString() {
        return "[note=" + note + ", source=" + source + ", longevityHours=" + longevityHours + "]";
    }
}
