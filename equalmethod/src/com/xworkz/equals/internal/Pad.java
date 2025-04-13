package com.xworkz.equals.internal;

import java.util.Objects;

public class Pad {
    private String brand;
    private double size;
    private boolean isRechargeable;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setIsRechargeable(boolean isRechargeable) {
        this.isRechargeable = isRechargeable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Pad) {
                System.out.println("Pad ref will compare");
                Pad pad1 = this;
                Pad pad2 = (Pad) obj;

                // Compare three properties: brand, size, and rechargeable status
                if (pad1.brand.equals(pad2.brand) && pad1.size == pad2.size && pad1.isRechargeable == pad2.isRechargeable) {
                    System.out.println("Both pads are the same based on brand, size, and rechargeable status");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pad [brand=" + brand + ", size=" + size + ", isRechargeable=" + isRechargeable + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, size, isRechargeable);
    }
}
