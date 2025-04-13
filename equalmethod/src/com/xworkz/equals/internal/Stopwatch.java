package com.xworkz.equals.internal;

import java.util.Objects;

public class Stopwatch {
    private String brand;
    private double time; // time in seconds
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Stopwatch) {
                System.out.println("Stopwatch ref will compare");
                Stopwatch stopwatch1 = this;
                Stopwatch stopwatch2 = (Stopwatch) obj;

                if (stopwatch1.brand.equals(stopwatch2.brand) && stopwatch1.time == stopwatch2.time) {
                    System.out.println("Both stopwatches have the same brand and time");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stopwatch [brand=" + brand + ", time=" + time + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, time, color);
    }
}
