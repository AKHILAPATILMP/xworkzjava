package com.xworkz.equals.internal;

import java.util.Objects;

public class Dustbin {
    private String type;   // Type of dustbin (e.g., "Plastic", "Metal")
    private int capacity;  // Capacity of the dustbin (in liters)
    private String color;  // Color of the dustbin (e.g., "Green", "Black")

    public void setType(String type) {
        this.type = type;
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

            if (obj instanceof Dustbin) {
                System.out.println("Dustbin ref will compare");
                Dustbin dustbin1 = this;
                Dustbin dustbin2 = (Dustbin) obj;

                // Compare three properties: type, capacity, and color
                if (dustbin1.type.equals(dustbin2.type) && dustbin1.capacity == dustbin2.capacity && dustbin1.color.equals(dustbin2.color)) {
                    System.out.println("Both dustbins are the same based on type, capacity, and color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dustbin [type=" + type + ", capacity=" + capacity + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, color);
    }
}
