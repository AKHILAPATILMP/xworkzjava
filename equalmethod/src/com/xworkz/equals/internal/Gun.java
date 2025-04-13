package com.xworkz.equals.internal;

import java.util.Objects;

public class Gun {
    private String type;
    private int range;
    private boolean isAutomatic;
    private double weight;

    public void setType(String type) {
        this.type = type;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Gun) {
                System.out.println("Gun ref will compare");
                Gun g1 = this;
                Gun g2 = (Gun) obj;

                if (g1.type.equals(g2.type) &&
                        g1.range == g2.range &&
                        g1.isAutomatic == g2.isAutomatic) {
                    System.out.println("Both guns have same type, range, and automatic status");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Gun [type=" + type + ", range=" + range + ", isAutomatic=" + isAutomatic + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, range, isAutomatic, weight);
    }
}
