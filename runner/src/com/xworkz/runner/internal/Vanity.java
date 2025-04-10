package com.xworkz.runner.internal;

public class Vanity {
    private String design;
    private int drawers;
    private String color;

    public Vanity(String design, int drawers, String color) {
        this.design = design;
        this.drawers = drawers;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[design=" + design + ", drawers=" + drawers + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 4567;
    }
}
