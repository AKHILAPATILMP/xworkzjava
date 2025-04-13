package com.xworkz.equals.internal;

import java.util.Objects;

public class Stapler {
    private String brand;      // Brand of the stapler (e.g., "Bostitch", "Swingline")
    private int capacity;      // Stapler capacity (e.g., 100 sheets)
    private boolean isElectric; // Whether the stapler is electric or manual

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Stapler) {
                System.out.println("Stapler ref will compare");
                Stapler stapler1 = this;
                Stapler stapler2 = (Stapler) obj;

                // Compare three properties: brand, capacity, and isElectric
                if (stapler1.brand.equals(stapler2.brand) && stapler1.capacity == stapler2.capacity && stapler1.isElectric == stapler2.isElectric) {
                    System.out.println("Both staplers are the same based on brand, capacity, and isElectric");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stapler [brand=" + brand + ", capacity=" + capacity + ", isElectric=" + isElectric + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, capacity, isElectric);
    }
}
