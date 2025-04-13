package com.xworkz.equals.internal;

import java.util.Objects;

public class Wheel {
    private double size;
    private String material;
    private String type;
    private String vehicleType;

    public void setSize(double size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Wheel) {
                System.out.println("Wheel ref will compare");
                Wheel wheel1 = this;
                Wheel wheel2 = (Wheel) obj;

                // Compare only size and material
                if (wheel1.size == wheel2.size && wheel1.material.equals(wheel2.material)) {
                    System.out.println("Both wheels have the same size and material");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Wheel [size=" + size + ", material=" + material + ", type=" + type + ", vehicleType=" + vehicleType + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, material);
    }
}
