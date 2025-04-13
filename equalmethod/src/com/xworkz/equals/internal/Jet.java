package com.xworkz.equals.internal;

import java.util.Objects;

public class Jet {
    private String model;
    private int maxSpeed;
    private String engineType;

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Jet) {
                System.out.println("Jet ref will compare");
                Jet jet1 = this;
                Jet jet2 = (Jet) obj;

                if (jet1.model.equals(jet2.model) &&
                        jet1.maxSpeed == jet2.maxSpeed &&
                        jet1.engineType.equals(jet2.engineType)) {
                    System.out.println("Both jets have the same model, max speed, and engine type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Jet [model=" + model + ", maxSpeed=" + maxSpeed + ", engineType=" + engineType + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, engineType);
    }
}
