package com.xworkz.equals.internal;

import java.util.Objects;

public class Pacemaker {
    private String brand;
    private double batteryLife;
    private String type;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Pacemaker) {
                System.out.println("Pacemaker ref will compare");
                Pacemaker pacemaker1 = this;
                Pacemaker pacemaker2 = (Pacemaker) obj;

                if (pacemaker1.brand.equals(pacemaker2.brand) && pacemaker1.batteryLife == pacemaker2.batteryLife) {
                    System.out.println("Both pacemakers have the same brand and battery life");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pacemaker [brand=" + brand + ", batteryLife=" + batteryLife + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, batteryLife, type);
    }
}
