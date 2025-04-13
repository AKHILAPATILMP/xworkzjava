package com.xworkz.equals.internal;

import java.util.Objects;

public class Workbench {
    private String material;
    private double size;
    private boolean hasDrawers;
    private String color;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setHasDrawers(boolean hasDrawers) {
        this.hasDrawers = hasDrawers;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Workbench) {
                System.out.println("Workbench ref will compare");
                Workbench workbench1 = this;
                Workbench workbench2 = (Workbench) obj;

                if (workbench1.material.equals(workbench2.material) && workbench1.size == workbench2.size) {
                    System.out.println("Both workbenches have the same material and size");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Workbench [material=" + material + ", size=" + size + ", hasDrawers=" + hasDrawers + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, size);
    }
}
