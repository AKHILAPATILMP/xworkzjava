package com.xworkz.equals.internal;

import java.util.Objects;

public class CraneShip {
    private String model;
    private int capacity;
    private String company;
    private double height;

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof CraneShip) {
                System.out.println("CraneShip ref will compare");
                CraneShip ship1 = this;
                CraneShip ship2 = (CraneShip) obj;

                if (ship1.model.equals(ship2.model)) {
                    System.out.println("Both crane ships have the same model");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CraneShip [model=" + model + ", capacity=" + capacity + ", company=" + company + ", height=" + height + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, capacity, company, height);
    }
}
