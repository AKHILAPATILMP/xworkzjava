package com.xworkz.equals.internal;

import java.util.Objects;

public class Sailboat {
    private String type;  // E.g., "Catamaran", "Monohull"
    private double length; // Length of the sailboat
    private boolean hasMotor; // Whether the sailboat has a motor or not

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHasMotor(boolean hasMotor) {
        this.hasMotor = hasMotor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Sailboat) {
                System.out.println("Sailboat ref will compare");
                Sailboat sailboat1 = this;
                Sailboat sailboat2 = (Sailboat) obj;

                // Compare three properties: type, length, and motor presence
                if (sailboat1.type.equals(sailboat2.type) && sailboat1.length == sailboat2.length && sailboat1.hasMotor == sailboat2.hasMotor) {
                    System.out.println("Both sailboats are the same based on type, length, and motor presence");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sailboat [type=" + type + ", length=" + length + ", hasMotor=" + hasMotor + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, length, hasMotor);
    }
}
