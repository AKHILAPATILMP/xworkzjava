package com.xworkz.equals.internal;

import java.util.Objects;

public class Dishrack {
    private String material;  // Material of the dishrack (e.g., "Plastic", "Metal")
    private int capacity;     // Capacity of the dishrack (number of dishes it can hold)
    private String color;     // Color of the dishrack

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Dishrack) {
                System.out.println("Dishrack ref will compare");
                Dishrack dishrack1 = this;
                Dishrack dishrack2 = (Dishrack) obj;

                // Compare three properties: material, capacity, and color
                if (dishrack1.material.equals(dishrack2.material) && dishrack1.capacity == dishrack2.capacity && dishrack1.color.equals(dishrack2.color)) {
                    System.out.println("Both dish racks are the same based on material, capacity, and color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dishrack [material=" + material + ", capacity=" + capacity + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, capacity, color);
    }
}
