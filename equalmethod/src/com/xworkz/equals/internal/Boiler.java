package com.xworkz.equals.internal;

import java.util.Objects;

public class Boiler {
    private String fuelType;
    private int capacity;
    private boolean isElectric;
    private double pressure;

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Boiler) {
                System.out.println("Boiler ref will compare");
                Boiler b1 = this;
                Boiler b2 = (Boiler) obj;

                if (b1.fuelType.equals(b2.fuelType) &&
                        b1.capacity == b2.capacity &&
                        b1.isElectric == b2.isElectric) {
                    System.out.println("Both boilers have same fuel type, capacity, and electric status");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Boiler [fuelType=" + fuelType + ", capacity=" + capacity + ", isElectric=" + isElectric + ", pressure=" + pressure + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelType, capacity, isElectric, pressure);
    }
}
