package com.xworkz.equals.internal;

import java.util.Objects;

public class HardDrive {
    private String brand;
    private int capacity; // in GB
    private String type;
    private boolean isExternal;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsExternal(boolean isExternal) {
        this.isExternal = isExternal;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof HardDrive) {
                System.out.println("HardDrive ref will compare");
                HardDrive d1 = this;
                HardDrive d2 = (HardDrive) obj;

                if (d1.brand.equals(d2.brand) && d1.capacity == d2.capacity) {
                    System.out.println("Both hard drives have the same brand and capacity");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "HardDrive [brand=" + brand + ", capacity=" + capacity + "GB, type=" + type + ", isExternal=" + isExternal + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, capacity, type, isExternal);
    }
}
