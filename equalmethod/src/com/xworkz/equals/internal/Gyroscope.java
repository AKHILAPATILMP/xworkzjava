package com.xworkz.equals.internal;

import java.util.Objects;

public class Gyroscope {
    private String type;
    private double sensitivity;
    private String manufacturer;
    private double weight;

    public void setType(String type) {
        this.type = type;
    }

    public void setSensitivity(double sensitivity) {
        this.sensitivity = sensitivity;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Gyroscope) {
                System.out.println("Gyroscope ref will compare");
                Gyroscope g1 = this;
                Gyroscope g2 = (Gyroscope) obj;

                if (g1.type.equals(g2.type) &&
                        g1.sensitivity == g2.sensitivity &&
                        g1.manufacturer.equals(g2.manufacturer)) {
                    System.out.println("Both gyroscopes have same type, sensitivity, and manufacturer");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Gyroscope [type=" + type + ", sensitivity=" + sensitivity + ", manufacturer=" + manufacturer + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sensitivity, manufacturer, weight);
    }
}
