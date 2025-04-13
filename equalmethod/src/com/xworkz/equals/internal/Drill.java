package com.xworkz.equals.internal;

import java.util.Objects;

public class Drill {
    private String brand;
    private int power;
    private String type;
    private double weight;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Drill) {
                System.out.println("Drill ref will compare");
                Drill d1 = this;
                Drill d2 = (Drill) obj;

                if (d1.brand.equals(d2.brand) &&
                        d1.power == d2.power &&
                        d1.type.equals(d2.type)) {
                    System.out.println("Both drills have same brand, power, and type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Drill [brand=" + brand + ", power=" + power + ", type=" + type + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, power, type, weight);
    }
}
