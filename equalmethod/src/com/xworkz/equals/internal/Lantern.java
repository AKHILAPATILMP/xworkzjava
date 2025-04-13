package com.xworkz.equals.internal;

import java.util.Objects;

public class Lantern {
    private String type;        // Type of lantern (e.g., "Oil", "Electric")
    private double brightness;  // Lantern brightness in lumens
    private boolean isPortable; // Whether the lantern is portable

    public void setType(String type) {
        this.type = type;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }

    public void setIsPortable(boolean isPortable) {
        this.isPortable = isPortable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Lantern) {
                System.out.println("Lantern ref will compare");
                Lantern lantern1 = this;
                Lantern lantern2 = (Lantern) obj;

                // Compare three properties: type, brightness, and isPortable
                if (lantern1.type.equals(lantern2.type) && lantern1.brightness == lantern2.brightness && lantern1.isPortable == lantern2.isPortable) {
                    System.out.println("Both lanterns are the same based on type, brightness, and isPortable");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Lantern [type=" + type + ", brightness=" + brightness + ", isPortable=" + isPortable + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brightness, isPortable);
    }
}
