package com.xworkz.equals.internal;

import java.util.Objects;

public class Windshield {
    private double thickness;
    private String material;

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Windshield) {
                System.out.println("Windshield ref will compare");
                Windshield windshield1 = this;
                Windshield windshield2 = (Windshield) obj;

                if (windshield1.thickness == windshield2.thickness && windshield1.material.equals(windshield2.material)) {
                    System.out.println("Both windshields have the same thickness and material");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Windshield [thickness=" + thickness + ", material=" + material + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(thickness, material);
    }
}
