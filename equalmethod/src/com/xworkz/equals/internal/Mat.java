package com.xworkz.equals.internal;

import java.util.Objects;

public class Mat {
    private String material;
    private double size;
    private String color;
    private double thickness;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Mat) {
                System.out.println("Mat ref will compare");
                Mat mat1 = this;
                Mat mat2 = (Mat) obj;

                if (mat1.material.equals(mat2.material) &&
                        mat1.size == mat2.size &&
                        mat1.color.equals(mat2.color)) {
                    System.out.println("Both mats have the same material, size, and color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Mat [material=" + material + ", size=" + size + ", color=" + color + ", thickness=" + thickness + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, size, color, thickness);
    }
}
