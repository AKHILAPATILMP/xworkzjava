package com.xworkz.equals.internal;

import java.util.Objects;

public class Stick {
    private String material;     // Material of the stick (e.g., "Wood", "Plastic")
    private double length;       // Length of the stick (in cm)
    private boolean isStraight;  // Whether the stick is straight or curved

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setIsStraight(boolean isStraight) {
        this.isStraight = isStraight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Stick) {
                System.out.println("Stick ref will compare");
                Stick stick1 = this;
                Stick stick2 = (Stick) obj;

                // Compare three properties: material, length, and isStraight
                if (stick1.material.equals(stick2.material) && stick1.length == stick2.length && stick1.isStraight == stick2.isStraight) {
                    System.out.println("Both sticks are the same based on material, length, and straightness");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stick [material=" + material + ", length=" + length + ", isStraight=" + isStraight + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, length, isStraight);
    }
}
