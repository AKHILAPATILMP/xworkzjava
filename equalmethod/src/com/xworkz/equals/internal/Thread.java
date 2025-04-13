package com.xworkz.equals.internal;

import java.util.Objects;

public class Thread {
    private String material;    // Material used for the thread (e.g., "Cotton", "Silk")
    private double length;      // Length of the thread in meters (e.g., 100.5)
    private String color;       // Color of the thread (e.g., "Red", "Blue")

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Thread) {
                System.out.println("Thread ref will compare");
                Thread thread1 = this;
                Thread thread2 = (Thread) obj;

                // Compare three properties: material, length, and color
                if (thread1.material.equals(thread2.material) && thread1.length == thread2.length && thread1.color.equals(thread2.color)) {
                    System.out.println("Both threads are the same based on material, length, and color");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Thread [material=" + material + ", length=" + length + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, length, color);
    }
}
