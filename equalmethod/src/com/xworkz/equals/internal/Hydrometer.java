package com.xworkz.equals.internal;

import java.util.Objects;

public class Hydrometer {
    private String brand;
    private double range;
    private boolean isDigital;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public void setIsDigital(boolean isDigital) {
        this.isDigital = isDigital;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Hydrometer) {
                System.out.println("Hydrometer ref will compare");
                Hydrometer hydrometer1 = this;
                Hydrometer hydrometer2 = (Hydrometer) obj;

                if (hydrometer1.brand.equals(hydrometer2.brand) && hydrometer1.range == hydrometer2.range) {
                    System.out.println("Both hydrometers have the same brand and range");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hydrometer [brand=" + brand + ", range=" + range + ", isDigital=" + isDigital + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, range, isDigital);
    }
}
