package com.xworkz.equals.internal;

import java.util.Objects;

public class Boat {
    private String type;
    private double length;
    private boolean hasEngine;

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Boat) {
                System.out.println("Boat ref will compare");
                Boat boat1 = this;
                Boat boat2 = (Boat) obj;

                // Compare three properties: type, length, and hasEngine
                if (boat1.type.equals(boat2.type) && boat1.length == boat2.length && boat1.hasEngine == boat2.hasEngine) {
                    System.out.println("Both boats are the same based on type, length, and engine");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Boat [type=" + type + ", length=" + length + ", hasEngine=" + hasEngine + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, length, hasEngine);
    }
}
