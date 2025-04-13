package com.xworkz.equals.internal;

import java.util.Objects;

public class Wetsuit {
    private String material;
    private double thickness;
    private String size;
    private boolean isShortSleeve;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setIsShortSleeve(boolean isShortSleeve) {
        this.isShortSleeve = isShortSleeve;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Wetsuit) {
                System.out.println("Wetsuit ref will compare");
                Wetsuit wetsuit1 = this;
                Wetsuit wetsuit2 = (Wetsuit) obj;

                if (wetsuit1.material.equals(wetsuit2.material) && wetsuit1.size.equals(wetsuit2.size)) {
                    System.out.println("Both wetsuits have the same material and size");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Wetsuit [material=" + material + ", thickness=" + thickness + ", size=" + size + ", isShortSleeve=" + isShortSleeve + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, thickness, size, isShortSleeve);
    }
}
