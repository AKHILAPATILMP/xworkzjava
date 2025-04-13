package com.xworkz.equals.internal;

import java.util.Objects;

public class Megaphone {
    private String brand;
    private int volume;
    private boolean wireless;
    private double weight;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Megaphone) {
            Megaphone other = (Megaphone) obj;
            return this.brand.equals(other.brand) && this.volume == other.volume;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Megaphone [brand=" + brand + ", volume=" + volume + ", wireless=" + wireless + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, volume);
    }
}
