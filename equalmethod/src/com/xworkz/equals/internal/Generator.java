package com.xworkz.equals.internal;

import java.util.Objects;

public class Generator {
    private String model;
    private int powerOutput;
    private String fuelType;
    private double weight;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPowerOutput(int powerOutput) {
        this.powerOutput = powerOutput;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Generator) {
                System.out.println("Generator ref will compare");
                Generator g1 = this;
                Generator g2 = (Generator) obj;

                if (g1.model.equals(g2.model)) {
                    System.out.println("Both generators have the same model");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Generator [model=" + model + ", powerOutput=" + powerOutput + ", fuelType=" + fuelType + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, powerOutput, fuelType, weight);
    }
}
