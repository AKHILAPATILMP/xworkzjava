package com.xworkz.runner.internal;

public class Shelf {
    private String material;
    private int numberOfLevels;
    private boolean wallMounted;

    public Shelf(String material, int numberOfLevels, boolean wallMounted) {
        this.material = material;
        this.numberOfLevels = numberOfLevels;
        this.wallMounted = wallMounted;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", numberOfLevels=" + numberOfLevels + ", wallMounted=" + wallMounted + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 509;
    }
}
