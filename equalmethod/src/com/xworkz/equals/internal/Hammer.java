package com.xworkz.equals.internal;

import java.util.Objects;

public class Hammer {
    private String type;
    private double weight;
    private String material;
    private int length;

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Hammer) {
                System.out.println("Hammer ref will compare");
                Hammer hammer1 = this;
                Hammer hammer2 = (Hammer) obj;

                if (hammer1.type.equals(hammer2.type)) {
                    System.out.println("Both hammers are of the same type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hammer [type=" + type + ", weight=" + weight + ", material=" + material + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight, material, length);
    }
}
