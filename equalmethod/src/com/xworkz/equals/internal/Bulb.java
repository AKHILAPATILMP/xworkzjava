package com.xworkz.equals.internal;

import java.util.Objects;

public class Bulb {
    private String shape;
    private int wattage;
    private String brand;
    private boolean isSmart;

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bulb) {
            Bulb other = (Bulb) obj;
            return this.shape.equals(other.shape) && this.wattage == other.wattage;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bulb [shape=" + shape + ", wattage=" + wattage + ", brand=" + brand + ", isSmart=" + isSmart + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, wattage);
    }
}
