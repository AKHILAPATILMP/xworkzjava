package com.xworkz.runner.internal;

public class Melody {
    private String scale;
    private String mood;
    private int lengthInBars;

    public Melody(String scale, String mood, int lengthInBars) {
        this.scale = scale;
        this.mood = mood;
        this.lengthInBars = lengthInBars;
    }

    @Override
    public String toString() {
        return "[scale=" + scale + ", mood=" + mood + ", lengthInBars=" + lengthInBars + "]";
    }
}
