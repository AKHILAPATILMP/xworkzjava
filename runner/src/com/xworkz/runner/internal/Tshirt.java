package com.xworkz.runner.internal;

import java.util.Objects;

public class Tshirt {
    private String brand;
    private int size;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            System.out.println("ref is not null");

            if (obj instanceof Tshirt) {
                System.out.println("tshirt ref is converted");
                Tshirt tshirt1 = this;
                Tshirt tshirt2 = (Tshirt) obj;
                if (tshirt1.brand == tshirt2.brand && tshirt1.size == tshirt2.size && tshirt1.color.equals(tshirt2.color)) {
                    System.out.println("tshirt 1 equals to tshirt 2");
                    return true;
                }
            }

        }

        return false;
    }
}
