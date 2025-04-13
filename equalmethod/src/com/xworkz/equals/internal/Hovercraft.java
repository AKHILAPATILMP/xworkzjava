package com.xworkz.equals.internal;

import java.util.Objects;

public class Hovercraft {
    private String model;
    private double weight;
    private double speed;
    private String manufacturer;

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Hovercraft) {
                System.out.println("Hovercraft ref will compare");
                Hovercraft hovercraft1 = this;
                Hovercraft hovercraft2 = (Hovercraft) obj;

                // Compare only model and weight
                if (hovercraft1.model.equals(hovercraft2.model) && hovercraft1.weight == hovercraft2.weight) {
                    System.out.println("Both hovercrafts have the same model and weight");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hovercraft [model=" + model + ", weight=" + weight + ", speed=" + speed + ", manufacturer=" + manufacturer + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, weight);
    }
}
