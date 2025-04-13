package com.xworkz.equals.internal;

import java.util.Objects;

public class Bulldozer {
    private String model;
    private double weight;
    private String manufacturer;
    private int horsepower;

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Bulldozer) {
                System.out.println("Bulldozer ref will compare");
                Bulldozer b1 = this;
                Bulldozer b2 = (Bulldozer) obj;

                if (b1.model.equals(b2.model)) {
                    System.out.println("Both bulldozers have the same model");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bulldozer [model=" + model + ", weight=" + weight + ", manufacturer=" + manufacturer + ", horsepower=" + horsepower + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, weight, manufacturer, horsepower);
    }
}
