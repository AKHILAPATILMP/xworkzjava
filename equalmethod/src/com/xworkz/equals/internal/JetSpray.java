package com.xworkz.equals.internal;

import java.util.Objects;

public class JetSpray {
    private String brand;
    private double capacity;
    private boolean isRechargeable;
    private String sprayType;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setIsRechargeable(boolean isRechargeable) {
        this.isRechargeable = isRechargeable;
    }

    public void setSprayType(String sprayType) {
        this.sprayType = sprayType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof JetSpray) {
                System.out.println("JetSpray ref will compare");
                JetSpray js1 = this;
                JetSpray js2 = (JetSpray) obj;

                if (js1.brand.equals(js2.brand) && js1.sprayType.equals(js2.sprayType)) {
                    System.out.println("Both JetSprays have the same brand and spray type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "JetSpray [brand=" + brand + ", capacity=" + capacity + ", isRechargeable=" + isRechargeable + ", sprayType=" + sprayType + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, capacity, isRechargeable, sprayType);
    }
}
