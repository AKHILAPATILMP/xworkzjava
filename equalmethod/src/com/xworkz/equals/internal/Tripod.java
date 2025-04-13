package com.xworkz.equals.internal;

import java.util.Objects;

public class Tripod {
    private String material;    // Material of the tripod (e.g., "Aluminum", "Plastic")
    private double height;      // Height of the tripod (in cm)
    private int legs;           // Number of legs (typically 3)

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Tripod) {
                System.out.println("Tripod ref will compare");
                Tripod tripod1 = this;
                Tripod tripod2 = (Tripod) obj;

                // Compare three properties: material, height, and number of legs
                if (tripod1.material.equals(tripod2.material) && tripod1.height == tripod2.height && tripod1.legs == tripod2.legs) {
                    System.out.println("Both tripods are the same based on material, height, and number of legs");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tripod [material=" + material + ", height=" + height + ", legs=" + legs + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, height, legs);
    }
}
