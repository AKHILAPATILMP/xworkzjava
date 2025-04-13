package com.xworkz.equals.internal;

import java.util.Objects;

public class Propeller {
    private String material;    // Material used for the propeller (e.g., "Aluminum", "Wood")
    private double diameter;    // Diameter of the propeller (e.g., 10.5)
    private int blades;         // Number of blades (e.g., 3, 4, 5)

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setBlades(int blades) {
        this.blades = blades;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Propeller) {
                System.out.println("Propeller ref will compare");
                Propeller propeller1 = this;
                Propeller propeller2 = (Propeller) obj;

                // Compare three properties: material, diameter, and blades
                if (propeller1.material.equals(propeller2.material) && propeller1.diameter == propeller2.diameter && propeller1.blades == propeller2.blades) {
                    System.out.println("Both propellers are the same based on material, diameter, and number of blades");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Propeller [material=" + material + ", diameter=" + diameter + ", blades=" + blades + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, diameter, blades);
    }
}
