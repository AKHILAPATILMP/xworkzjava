package com.xworkz.equals.internal;

import java.util.Objects;

public class Hydroplane {
    private String model; // Model of the hydroplane (e.g., "AeroHydro", "SeaJet")

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Hydroplane) {
                System.out.println("Hydroplane ref will compare");
                Hydroplane hydroplane1 = this;
                Hydroplane hydroplane2 = (Hydroplane) obj;

                if (hydroplane1.model.equals(hydroplane2.model)) {
                    System.out.println("Both hydroplanes have the same model");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hydroplane [model=" + model + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
