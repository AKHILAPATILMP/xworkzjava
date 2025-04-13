package com.xworkz.equals.internal;

import java.util.Objects;

public class Microscope {
    private String brand;
    private int magnification;
    private String type;
    private boolean isDigital;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMagnification(int magnification) {
        this.magnification = magnification;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsDigital(boolean isDigital) {
        this.isDigital = isDigital;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Microscope) {
                System.out.println("Microscope ref will compare");
                Microscope m1 = this;
                Microscope m2 = (Microscope) obj;

                if (m1.brand.equals(m2.brand) && m1.magnification == m2.magnification) {
                    System.out.println("Both microscopes have the same brand and magnification");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Microscope [brand=" + brand + ", magnification=" + magnification + ", type=" + type + ", isDigital=" + isDigital + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, magnification);
    }
}
