package com.xworkz.equals.internal;

import java.util.Objects;

public class Chip {
    private String type;
    private double weight;
    private String brand;
    private boolean isSalted;

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setIsSalted(boolean isSalted) {
        this.isSalted = isSalted;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Chip) {
                System.out.println("Chip ref will compare");
                Chip chip1 = this;
                Chip chip2 = (Chip) obj;

                if (chip1.type.equals(chip2.type) &&
                        chip1.weight == chip2.weight &&
                        chip1.brand.equals(chip2.brand)) {
                    System.out.println("Both chips have the same type, weight, and brand");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Chip [type=" + type + ", weight=" + weight + ", brand=" + brand + ", isSalted=" + isSalted + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight, brand, isSalted);
    }
}
