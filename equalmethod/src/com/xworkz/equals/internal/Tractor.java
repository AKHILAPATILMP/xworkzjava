package com.xworkz.equals.internal;

import java.util.Objects;

public class Tractor {
    private String model;
    private int horsepower;
    private String fuelType;

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Tractor) {
                System.out.println("Tractor ref will compare");
                Tractor tractor1 = this;
                Tractor tractor2 = (Tractor) obj;

                if (tractor1.model.equals(tractor2.model) &&
                        tractor1.horsepower == tractor2.horsepower &&
                        tractor1.fuelType.equals(tractor2.fuelType)) {
                    System.out.println("Both tractors have the same model, horsepower, and fuel type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tractor [model=" + model + ", horsepower=" + horsepower + ", fuelType=" + fuelType + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, horsepower, fuelType);
    }
}
