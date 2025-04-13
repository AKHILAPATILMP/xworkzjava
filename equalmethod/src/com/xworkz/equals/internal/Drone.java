package com.xworkz.equals.internal;

import java.util.Objects;

public class Drone {
    private String modelName; // Model name of the drone (e.g., "DJI Phantom", "Mavic Air")

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Drone) {
                System.out.println("Drone ref will compare");
                Drone drone1 = this;
                Drone drone2 = (Drone) obj;

                if (drone1.modelName.equals(drone2.modelName)) {
                    System.out.println("Both drones have the same model name");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Drone [modelName=" + modelName + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName);
    }
}
