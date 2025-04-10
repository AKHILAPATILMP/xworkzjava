package com.xworkz.runner.internal;

public class Rhythm {
    private String type;
    private int tempo;
    private String origin;

    public Rhythm(String type, int tempo, String origin) {
        this.type = type;
        this.tempo = tempo;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", tempo=" + tempo + ", origin=" + origin + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 501;
    }
}
