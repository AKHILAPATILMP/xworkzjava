package com.xworkz.equals.internal;

import java.util.Objects;

public class Airship {
    private String name;
    private int capacity;
    private double altitude;
    private String gasType;

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Airship) {
                System.out.println("Airship ref will compare");
                Airship a1 = this;
                Airship a2 = (Airship) obj;

                if (a1.name.equals(a2.name) &&
                        a1.capacity == a2.capacity &&
                        a1.gasType.equals(a2.gasType)) {
                    System.out.println("Both airships have same name, capacity, and gas type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Airship [name=" + name + ", capacity=" + capacity + ", altitude=" + altitude + ", gasType=" + gasType + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, altitude, gasType);
    }
}
