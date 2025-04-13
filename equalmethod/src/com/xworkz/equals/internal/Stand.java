package com.xworkz.equals.internal;

import java.util.Objects;

public class Stand {
    private String material;  // Material of the stand (e.g., "Wood", "Metal")
    private double height;    // Height of the stand
    private String color;     // Color of the stand

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Stand) {
                System.out.println("Stand ref will compare");
                Stand stand1 = this;
                Stand stand2 = (Stand) obj;

                // Compare three properties: material, height, and color
                if (stand1.material.equals(stand2.material) && stand1.height == stand2.height && stand1.color.equals(stand2.color)) {
                    System.out.println("Both stands are the same based on material, height, and color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stand [material=" + material + ", height=" + height + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, height, color);
    }
}
