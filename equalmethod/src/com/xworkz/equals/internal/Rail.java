package com.xworkz.equals.internal;

import java.util.Objects;

public class Rail {
    private String type;
    private double length;
    private String material;
    private boolean electrified;

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setElectrified(boolean electrified) {
        this.electrified = electrified;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Rail) {
                System.out.println("Rail ref will compare");
                Rail rail1 = this;
                Rail rail2 = (Rail) obj;

                if (rail1.type.equals(rail2.type) && rail1.material.equals(rail2.material)) {
                    System.out.println("Both rails have the same type and material");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rail [type=" + type + ", length=" + length + ", material=" + material + ", electrified=" + electrified + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, length, material, electrified);
    }
}
