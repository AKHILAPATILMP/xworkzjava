package com.xworkz.equals.internal;

import java.util.Objects;

public class Thermometer {
    private String scale;

    public void setScale(String scale) {
        this.scale = scale;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Thermometer) {
                System.out.println("Thermometer ref will compare");
                Thermometer thermometer1 = this;
                Thermometer thermometer2 = (Thermometer) obj;

                if (thermometer1.scale.equals(thermometer2.scale)) {
                    System.out.println("Both thermometers have the same scale");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Thermometer [scale=" + scale + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(scale);
    }
}
