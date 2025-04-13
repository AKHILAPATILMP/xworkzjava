package com.xworkz.equals.internal;

import java.util.Objects;

public class Sand {
    private String color;
    private double grainSize;
    private String location;
    private boolean isFine;

    public void setColor(String color) {
        this.color = color;
    }

    public void setGrainSize(double grainSize) {
        this.grainSize = grainSize;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setIsFine(boolean isFine) {
        this.isFine = isFine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Sand) {
                System.out.println("Sand ref will compare");
                Sand sand1 = this;
                Sand sand2 = (Sand) obj;

                if (sand1.color.equals(sand2.color)) {
                    System.out.println("Both sands have the same color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sand [color=" + color + ", grainSize=" + grainSize + ", location=" + location + ", isFine=" + isFine + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, grainSize, location, isFine);
    }
}
