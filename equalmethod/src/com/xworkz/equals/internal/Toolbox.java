package com.xworkz.equals.internal;

import java.util.Objects;

public class Toolbox {
    private String material;  // Material of the toolbox (e.g., "Metal", "Plastic")
    private int capacity;     // Capacity of the toolbox (number of tools it can hold)
    private String color;     // Color of the toolbox (e.g., "Red", "Blue")

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

            if (obj instanceof Toolbox) {
                System.out.println("Toolbox ref will compare");
                Toolbox toolbox1 = this;
                Toolbox toolbox2 = (Toolbox) obj;

                // Compare three properties: material, capacity, and color
                if (toolbox1.material.equals(toolbox2.material) && toolbox1.capacity == toolbox2.capacity && toolbox1.color.equals(toolbox2.color)) {
                    System.out.println("Both toolboxes are the same based on material, capacity, and color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Toolbox [material=" + material + ", capacity=" + capacity + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, capacity, color);
    }
}
