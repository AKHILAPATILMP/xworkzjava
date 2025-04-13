package com.xworkz.equals.internal;

import java.util.Objects;

public class Doorknob {
    private String material;  // Material of the doorknob (e.g., "Brass", "Steel")
    private double diameter;  // Diameter of the doorknob
    private boolean isRound;  // Whether the doorknob is round or not

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setIsRound(boolean isRound) {
        this.isRound = isRound;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Doorknob) {
                System.out.println("Doorknob ref will compare");
                Doorknob doorknob1 = this;
                Doorknob doorknob2 = (Doorknob) obj;

                // Compare three properties: material, diameter, and roundness
                if (doorknob1.material.equals(doorknob2.material) && doorknob1.diameter == doorknob2.diameter && doorknob1.isRound == doorknob2.isRound) {
                    System.out.println("Both doorknobs are the same based on material, diameter, and roundness");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Doorknob [material=" + material + ", diameter=" + diameter + ", isRound=" + isRound + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, diameter, isRound);
    }
}
