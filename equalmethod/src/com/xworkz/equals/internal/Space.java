package com.xworkz.equals.internal;

import java.util.Objects;

public class Space {
    private String name;
    private double area;
    private String purpose;
    private String agency;

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Space) {
                System.out.println("Space ref will compare");
                Space s1 = this;
                Space s2 = (Space) obj;

                if (s1.name.equals(s2.name)) {
                    System.out.println("Both spaces have the same name");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Space [name=" + name + ", area=" + area + ", purpose=" + purpose + ", agency=" + agency + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area, purpose, agency);
    }
}
