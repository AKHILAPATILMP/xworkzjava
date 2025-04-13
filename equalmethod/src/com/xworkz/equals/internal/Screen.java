package com.xworkz.equals.internal;

import java.util.Objects;

public class Screen {
    private String resolution;
    private double size; // in inches
    private String type;
    private boolean isTouch;

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsTouch(boolean isTouch) {
        this.isTouch = isTouch;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Screen) {
                System.out.println("Screen ref will compare");
                Screen s1 = this;
                Screen s2 = (Screen) obj;

                if (s1.resolution.equals(s2.resolution) && s1.size == s2.size) {
                    System.out.println("Both screens have the same resolution and size");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Screen [resolution=" + resolution + ", size=" + size + " inches, type=" + type + ", isTouch=" + isTouch + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolution, size, type, isTouch);
    }
}
