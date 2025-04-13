package com.xworkz.equals.internal;

import java.util.Objects;

public class Zipper {
    private String material;     // Material of the zipper (e.g., "Metal", "Plastic")
    private double length;       // Length of the zipper in centimeters
    private String color;        // Color of the zipper (e.g., "Silver", "Black")

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Zipper) {
                System.out.println("Zipper ref will compare");
                Zipper zipper1 = this;
                Zipper zipper2 = (Zipper) obj;

                // Compare three properties: material, length, and color
                if (zipper1.material.equals(zipper2.material) && zipper1.length == zipper2.length && zipper1.color.equals(zipper2.color)) {
                    System.out.println("Both zippers are the same based on material, length, and color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Zipper [material=" + material + ", length=" + length + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, length, color);
    }
}
