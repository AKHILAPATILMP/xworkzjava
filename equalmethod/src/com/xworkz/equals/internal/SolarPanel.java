package com.xworkz.equals.internal;

import java.util.Objects;

public class SolarPanel {
    private String type;
    private int capacity;
    private double efficiency;
    private String manufacturer;

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof SolarPanel) {
                System.out.println("SolarPanel ref will compare");
                SolarPanel sp1 = this;
                SolarPanel sp2 = (SolarPanel) obj;

                if (sp1.type.equals(sp2.type)) {
                    System.out.println("Both solar panels are the same type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "SolarPanel [type=" + type + ", capacity=" + capacity + ", efficiency=" + efficiency + ", manufacturer=" + manufacturer + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, efficiency, manufacturer);
    }
}
