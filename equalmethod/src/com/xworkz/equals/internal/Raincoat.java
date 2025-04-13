package com.xworkz.equals.internal;

import java.util.Objects;

public class Raincoat {
    private String color; // Color of the raincoat (e.g., "Yellow", "Green")

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Raincoat) {
                System.out.println("Raincoat ref will compare");
                Raincoat raincoat1 = this;
                Raincoat raincoat2 = (Raincoat) obj;

                if (raincoat1.color.equals(raincoat2.color)) {
                    System.out.println("Both raincoats have the same color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Raincoat [color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
