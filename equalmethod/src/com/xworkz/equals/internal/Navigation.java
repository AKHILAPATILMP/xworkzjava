package com.xworkz.equals.internal;

import java.util.Objects;

public class Navigation {
    private String mode; // The mode of navigation, like "GPS", "Map", etc.
    private String source;
    private String destination;
    private double distance;

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Navigation) {
                System.out.println("Navigation ref will compare");
                Navigation nav1 = this;
                Navigation nav2 = (Navigation) obj;

                if (nav1.mode.equals(nav2.mode)) {
                    System.out.println("Both navigation objects have the same mode");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Navigation [mode=" + mode + ", source=" + source + ", destination=" + destination + ", distance=" + distance + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, source, destination, distance);
    }
}
