package com.xworkz.equals.internal;

import java.util.Objects;

public class Gasoline {
    private String type;       // Type of gasoline (e.g., "Regular", "Premium")
    private double octaneLevel;  // Octane level of the gasoline (e.g., 87, 91)
    private String origin;     // Origin of the gasoline (e.g., "USA", "Canada")

    public void setType(String type) {
        this.type = type;
    }

    public void setOctaneLevel(double octaneLevel) {
        this.octaneLevel = octaneLevel;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Gasoline) {
                System.out.println("Gasoline ref will compare");
                Gasoline gasoline1 = this;
                Gasoline gasoline2 = (Gasoline) obj;

                // Compare three properties: type, octane level, and origin
                if (gasoline1.type.equals(gasoline2.type) && gasoline1.octaneLevel == gasoline2.octaneLevel && gasoline1.origin.equals(gasoline2.origin)) {
                    System.out.println("Both gasoline types are the same based on type, octane level, and origin");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Gasoline [type=" + type + ", octaneLevel=" + octaneLevel + ", origin=" + origin + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, octaneLevel, origin);
    }
}
