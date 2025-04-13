package com.xworkz.equals.internal;

import java.util.Objects;

public class Tub {
    private String material;       // Material of the tub (e.g., "Plastic", "Wood")
    private double capacity;       // Capacity of the tub in liters
    private boolean hasDrainPlug;  // Whether the tub has a drain plug

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setHasDrainPlug(boolean hasDrainPlug) {
        this.hasDrainPlug = hasDrainPlug;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Tub) {
                System.out.println("Tub ref will compare");
                Tub tub1 = this;
                Tub tub2 = (Tub) obj;

                // Compare three properties: material, capacity, and hasDrainPlug
                if (tub1.material.equals(tub2.material) && tub1.capacity == tub2.capacity && tub1.hasDrainPlug == tub2.hasDrainPlug) {
                    System.out.println("Both tubs are the same based on material, capacity, and hasDrainPlug");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tub [material=" + material + ", capacity=" + capacity + ", hasDrainPlug=" + hasDrainPlug + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, capacity, hasDrainPlug);
    }
}
