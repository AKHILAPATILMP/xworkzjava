package com.xworkz.equals.internal;

import java.util.Objects;

public class Transistor {
    private String type;
    private String material;
    private double frequency;
    private int powerRating;

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Transistor) {
                System.out.println("Transistor ref will compare");
                Transistor t1 = this;
                Transistor t2 = (Transistor) obj;

                if (t1.type.equals(t2.type) &&
                        t1.material.equals(t2.material) &&
                        t1.frequency == t2.frequency) {
                    System.out.println("Both transistors have same type, material, and frequency");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Transistor [type=" + type + ", material=" + material + ", frequency=" + frequency + ", powerRating=" + powerRating + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, material, frequency, powerRating);
    }
}
