package com.xworkz.equals.internal;

import java.util.Objects;

public class Rocket {
    private String name;
    private double height;
    private double weight;
    private String country;

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Rocket) {
                System.out.println("Rocket ref will compare");
                Rocket r1 = this;
                Rocket r2 = (Rocket) obj;

                if (r1.name.equals(r2.name)) {
                    System.out.println("Both rockets have the same name");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rocket [name=" + name + ", height=" + height + ", weight=" + weight + ", country=" + country + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, country);
    }
}
