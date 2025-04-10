package com.xworkz.runner.internal;

public class Rose {
    private String color;
    private int petalCount;
    private String fragranceLevel;

    public Rose(String color, int petalCount, String fragranceLevel) {
        this.color = color;
        this.petalCount = petalCount;
        this.fragranceLevel = fragranceLevel;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", petalCount=" + petalCount + ", fragranceLevel=" + fragranceLevel + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 504;
    }
}
