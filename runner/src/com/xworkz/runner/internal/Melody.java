package com.xworkz.runner.internal;

public class Melody {
    private String genre;
    private String composer;
    private double duration;

    public Melody(String genre, String composer, double duration) {
        this.genre = genre;
        this.composer = composer;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "[genre=" + genre + ", composer=" + composer + ", duration=" + duration + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 543;
    }
}
