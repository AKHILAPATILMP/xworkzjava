package com.xworkz.equals.internal;

import java.util.Objects;

public class Lunchbox {
    private String color;    // Color of the lunchbox (e.g., "Red", "Blue")
    private String material; // Material of the lunchbox (e.g., "Plastic", "Steel")
    private int compartments; // Number of compartments in the lunchbox

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCompartments(int compartments) {
        this.compartments = compartments;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Lunchbox) {
                System.out.println("Lunchbox ref will compare");
                Lunchbox lunchbox1 = this;
                Lunchbox lunchbox2 = (Lunchbox) obj;

                // Compare three properties: color, material, and compartments
                if (lunchbox1.color.equals(lunchbox2.color) && lunchbox1.material.equals(lunchbox2.material) && lunchbox1.compartments == lunchbox2.compartments) {
                    System.out.println("Both lunchboxes are the same based on color, material, and compartments");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Lunchbox [color=" + color + ", material=" + material + ", compartments=" + compartments + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, material, compartments);
    }
}
