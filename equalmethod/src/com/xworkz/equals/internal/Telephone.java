package com.xworkz.equals.internal;

import java.util.Objects;

public class Telephone {
    private String model;
    private int year;
    private boolean isRotary;
    private String provider;

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIsRotary(boolean isRotary) {
        this.isRotary = isRotary;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Telephone) {
            Telephone other = (Telephone) obj;
            return this.model.equals(other.model) && this.year == other.year;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Telephone [model=" + model + ", year=" + year + ", isRotary=" + isRotary + ", provider=" + provider + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}
