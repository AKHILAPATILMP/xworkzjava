package com.xworkz.equals.internal;

import java.util.Objects;

public class Circuit {
    private String type;
    private int numberOfComponents;
    private String material;

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberOfComponents(int numberOfComponents) {
        this.numberOfComponents = numberOfComponents;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Circuit) {
                System.out.println("Circuit ref will compare");
                Circuit circuit1 = this;
                Circuit circuit2 = (Circuit) obj;

                if (circuit1.type.equals(circuit2.type) &&
                        circuit1.numberOfComponents == circuit2.numberOfComponents &&
                        circuit1.material.equals(circuit2.material)) {
                    System.out.println("Both circuits have the same type, number of components, and material");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circuit [type=" + type + ", numberOfComponents=" + numberOfComponents + ", material=" + material + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, numberOfComponents, material);
    }
}
