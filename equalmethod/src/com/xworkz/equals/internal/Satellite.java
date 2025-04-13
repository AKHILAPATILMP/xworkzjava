package com.xworkz.equals.internal;

import java.util.Objects;

public class Satellite {
    private String name;
    private double weight;
    private String orbitType;
    private int launchYear;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOrbitType(String orbitType) {
        this.orbitType = orbitType;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Satellite) {
                System.out.println("Satellite ref will compare");
                Satellite s1 = this;
                Satellite s2 = (Satellite) obj;

                if (s1.name.equals(s2.name)) {
                    System.out.println("Both satellites have the same name");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Satellite [name=" + name + ", weight=" + weight + ", orbitType=" + orbitType + ", launchYear=" + launchYear + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, orbitType, launchYear);
    }
}
