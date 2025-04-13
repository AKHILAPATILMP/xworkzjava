package com.xworkz.equals.internal;

import java.util.Objects;

public class Windmill {
    private String location;
    private double height;
    private int bladeCount;
    private String material;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBladeCount(int bladeCount) {
        this.bladeCount = bladeCount;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Windmill) {
                System.out.println("Windmill ref will compare");
                Windmill w1 = this;
                Windmill w2 = (Windmill) obj;

                if (w1.location.equals(w2.location) &&
                        w1.height == w2.height &&
                        w1.bladeCount == w2.bladeCount) {
                    System.out.println("Both windmills have the same location, height, and blade count");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Windmill [location=" + location + ", height=" + height + ", bladeCount=" + bladeCount + ", material=" + material + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, height, bladeCount, material);
    }
}
