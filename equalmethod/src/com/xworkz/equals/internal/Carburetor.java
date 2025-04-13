package com.xworkz.equals.internal;

import java.util.Objects;

public class Carburetor {
    private String brand;
    private double fuelEfficiency;
    private int horsepower;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Carburetor) {
                System.out.println("Carburetor ref will compare");
                Carburetor carb1 = this;
                Carburetor carb2 = (Carburetor) obj;

                if (carb1.brand.equals(carb2.brand) && carb1.fuelEfficiency == carb2.fuelEfficiency) {
                    System.out.println("Both carburetors have the same brand and fuel efficiency");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carburetor [brand=" + brand + ", fuelEfficiency=" + fuelEfficiency + ", horsepower=" + horsepower + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, fuelEfficiency, horsepower);
    }
}
