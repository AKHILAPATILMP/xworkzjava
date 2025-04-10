package com.xworkz.runner.internal;

public class Shadow {
    private String shape;
    private double length;
    private boolean visible;

    public Shadow(String shape, double length, boolean visible) {
        this.shape = shape;
        this.length = length;
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "[shape=" + shape + ", length=" + length + ", visible=" + visible + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 508;
    }
}
