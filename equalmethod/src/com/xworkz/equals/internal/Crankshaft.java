package com.xworkz.equals.internal;

import java.util.Objects;

public class Crankshaft {
    private String material;
    private double diameter;
    private double length;
    private String engineType;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Crankshaft) {
                System.out.println("Crankshaft ref will compare");
                Crankshaft crankshaft1 = this;
                Crankshaft crankshaft2 = (Crankshaft) obj;

                // Compare only material and diameter
                if (crankshaft1.material.equals(crankshaft2.material) && crankshaft1.diameter == crankshaft2.diameter) {
                    System.out.println("Both crankshafts have the same material and diameter");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Crankshaft [material=" + material + ", diameter=" + diameter + ", length=" + length + ", engineType=" + engineType + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, diameter);
    }
}
