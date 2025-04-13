package com.xworkz.equals.internal;

import java.util.Objects;

public class Gearbox {
    private String type;
    private int numberOfGears;
    private String material;
    private boolean isAutomatic;

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Gearbox) {
                System.out.println("Gearbox ref will compare");
                Gearbox gearbox1 = this;
                Gearbox gearbox2 = (Gearbox) obj;

                if (gearbox1.type.equals(gearbox2.type) && gearbox1.numberOfGears == gearbox2.numberOfGears) {
                    System.out.println("Both gearboxes have the same type and number of gears");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Gearbox [type=" + type + ", numberOfGears=" + numberOfGears + ", material=" + material + ", isAutomatic=" + isAutomatic + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, numberOfGears);
    }
}
