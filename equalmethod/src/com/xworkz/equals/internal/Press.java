package com.xworkz.equals.internal;

import java.util.Objects;

public class Press {
    private String type;
    private String material;
    private int pressure;
    private String purpose;

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Press) {
                System.out.println("Press ref will compare");
                Press p1 = this;
                Press p2 = (Press) obj;

                if (p1.type.equals(p2.type)) {
                    System.out.println("Both presses  have the same type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Press [type=" + type + ", material=" + material + ", pressure=" + pressure + ", purpose=" + purpose + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, material, pressure, purpose);
    }
}
