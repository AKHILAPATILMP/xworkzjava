package com.xworkz.equals.internal;

import java.util.Objects;

public class Coat {
    private String material;
    private String color;
    private int size;
    private boolean isWaterproof;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setIsWaterproof(boolean isWaterproof) {
        this.isWaterproof = isWaterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Coat) {
                System.out.println("Coat ref will compare");
                Coat c1 = this;
                Coat c2 = (Coat) obj;

                if (c1.material.equals(c2.material) && c1.color.equals(c2.color)) {
                    System.out.println("Both coats have the same material and color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Coat [material=" + material + ", color=" + color + ", size=" + size + ", isWaterproof=" + isWaterproof + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, color, size, isWaterproof);
    }
}
