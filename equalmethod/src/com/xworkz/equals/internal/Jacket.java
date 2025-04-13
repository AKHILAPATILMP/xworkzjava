package com.xworkz.equals.internal;

import java.util.Objects;

public class Jacket {
    private String material;
    private String size;
    private boolean isWaterproof;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setIsWaterproof(boolean isWaterproof) {
        this.isWaterproof = isWaterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Jacket) {
                System.out.println("Jacket ref will compare");
                Jacket jacket1 = this;
                Jacket jacket2 = (Jacket) obj;

                // Compare three properties: material, size, and waterproof status
                if (jacket1.material.equals(jacket2.material) && jacket1.size.equals(jacket2.size) && jacket1.isWaterproof == jacket2.isWaterproof) {
                    System.out.println("Both jackets are the same based on material, size, and waterproof status");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Jacket [material=" + material + ", size=" + size + ", isWaterproof=" + isWaterproof + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, size, isWaterproof);
    }
}
