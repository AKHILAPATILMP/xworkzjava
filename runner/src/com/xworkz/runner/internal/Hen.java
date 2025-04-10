package com.xworkz.runner.internal;

public class Hen {
    private String breed;
    private String color;
    private int eggPerWeek;

    public Hen(String breed, String color, int eggPerWeek) {
        this.breed = breed;
        this.color = color;
        this.eggPerWeek = eggPerWeek;
    }

    @Override
    public String toString() {
        return "[breed=" + breed + ", color=" + color + ", eggPerWeek=" + eggPerWeek + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 202;
    }
}
