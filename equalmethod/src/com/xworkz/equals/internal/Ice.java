package com.xworkz.equals.internal;

import java.util.Objects;

public class Ice {
    private String type;
    private double temperature;
    private double density;
    private String origin;

    public void setType(String type) {
        this.type = type;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Ice) {
                System.out.println("Ice ref will compare");
                Ice ice1 = this;
                Ice ice2 = (Ice) obj;

                if (ice1.type.equals(ice2.type)) {
                    System.out.println("Both ice types are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ice [type=" + type + ", temperature=" + temperature + ", density=" + density + ", origin=" + origin + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, temperature, density, origin);
    }
}
