package com.xworkz.equals.internal;

import java.util.Objects;

public class Door {
    private String material; // Material of the door (e.g., "Wood", "Metal")

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Door) {
                System.out.println("Door ref will compare");
                Door door1 = this;
                Door door2 = (Door) obj;

                if (door1.material.equals(door2.material)) {
                    System.out.println("Both doors are made of the same material");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Door [material=" + material + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }
}
