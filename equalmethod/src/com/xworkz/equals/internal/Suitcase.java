package com.xworkz.equals.internal;

import java.util.Objects;

public class Suitcase {
    private String brand;
    private double weight;
    private String color;
    private int numberOfWheels;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Suitcase) {
                System.out.println("Suitcase ref will compare");
                Suitcase suitcase1 = this;
                Suitcase suitcase2 = (Suitcase) obj;

                if (suitcase1.brand.equals(suitcase2.brand) && suitcase1.color.equals(suitcase2.color)) {
                    System.out.println("Both suitcases have the same brand and color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Suitcase [brand=" + brand + ", weight=" + weight + ", color=" + color + ", numberOfWheels=" + numberOfWheels + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color);
    }
}
