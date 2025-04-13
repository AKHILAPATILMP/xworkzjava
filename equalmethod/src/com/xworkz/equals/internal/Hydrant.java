package com.xworkz.equals.internal;

import java.util.Objects;

public class Hydrant {
    private String location;
    private String color;
    private int waterPressure;
    private boolean isOperational;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWaterPressure(int waterPressure) {
        this.waterPressure = waterPressure;
    }

    public void setIsOperational(boolean isOperational) {
        this.isOperational = isOperational;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Hydrant) {
                System.out.println("Hydrant ref will compare");
                Hydrant h1 = this;
                Hydrant h2 = (Hydrant) obj;

                if (h1.location.equals(h2.location) &&
                        h1.color.equals(h2.color) &&
                        h1.waterPressure == h2.waterPressure) {
                    System.out.println("Both hydrants have same location, color, and water pressure");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hydrant [location=" + location + ", color=" + color + ", waterPressure=" + waterPressure + ", isOperational=" + isOperational + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, color, waterPressure, isOperational);
    }
}
