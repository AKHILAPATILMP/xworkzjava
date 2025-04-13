package com.xworkz.equals.internal;

import java.util.Objects;

public class Thermos {
    private String brand;
    private double capacity;
    private String color;
    private boolean isInsulated;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsInsulated(boolean isInsulated) {
        this.isInsulated = isInsulated;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Thermos) {
                System.out.println("Thermos ref will compare");
                Thermos t1 = this;
                Thermos t2 = (Thermos) obj;

                if (t1.brand.equals(t2.brand) && t1.color.equals(t2.color)) {
                    System.out.println("Both thermos bottles have the same brand and color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Thermos [brand=" + brand + ", capacity=" + capacity + ", color=" + color + ", isInsulated=" + isInsulated + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, capacity, color, isInsulated);
    }
}
