package com.xworkz.equals.internal;

import java.util.Objects;

public class Whiteboard {
    private String brand;
    private double size;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Whiteboard) {
                System.out.println("Whiteboard ref will compare");
                Whiteboard board1 = this;
                Whiteboard board2 = (Whiteboard) obj;

                if (board1.brand.equals(board2.brand) && board1.size == board2.size) {
                    System.out.println("Both whiteboards have the same brand and size");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Whiteboard [brand=" + brand + ", size=" + size + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, size, color);
    }
}
