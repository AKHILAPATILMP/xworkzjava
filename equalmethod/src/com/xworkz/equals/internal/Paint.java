package com.xworkz.equals.internal;

import java.util.Objects;

public class Paint {
    private String color;    // Color of the paint (e.g., "Red", "Blue")
    private String type;     // Type of paint (e.g., "Acrylic", "Oil")
    private double volume;   // Volume of paint in liters

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Paint) {
                System.out.println("Paint ref will compare");
                Paint paint1 = this;
                Paint paint2 = (Paint) obj;

                // Compare three properties: color, type, and volume
                if (paint1.color.equals(paint2.color) && paint1.type.equals(paint2.type) && paint1.volume == paint2.volume) {
                    System.out.println("Both paints are the same based on color, type, and volume");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Paint [color=" + color + ", type=" + type + ", volume=" + volume + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, type, volume);
    }
}
