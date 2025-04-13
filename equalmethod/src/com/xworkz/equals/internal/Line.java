package com.xworkz.equals.internal;

import java.util.Objects;

public class Line {
    private double length;
    private String color;
    private boolean isDashed;

    public void setLength(double length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsDashed(boolean isDashed) {
        this.isDashed = isDashed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Line) {
                System.out.println("Line ref will compare");
                Line line1 = this;
                Line line2 = (Line) obj;

                if (line1.length == line2.length) {
                    System.out.println("Both lines have the same length");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Line [length=" + length + ", color=" + color + ", isDashed=" + isDashed + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, color, isDashed);
    }
}
