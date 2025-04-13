package com.xworkz.equals.internal;

import java.util.Objects;

public class Hourglass {
    private String material;
    private double height;
    private double width;
    private boolean isAntique;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setIsAntique(boolean isAntique) {
        this.isAntique = isAntique;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Hourglass) {
                System.out.println("Hourglass ref will compare");
                Hourglass hourglass1 = this;
                Hourglass hourglass2 = (Hourglass) obj;

                if (hourglass1.material.equals(hourglass2.material) && hourglass1.isAntique == hourglass2.isAntique) {
                    System.out.println("Both hourglasses have the same material and antique status");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hourglass [material=" + material + ", height=" + height + ", width=" + width + ", isAntique=" + isAntique + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, isAntique);
    }
}
