package com.xworkz.equals.internal;

import java.util.Objects;

public class Fire {
    private String type;
    private double temperature;
    private boolean isControlled;
    private String source;

    public void setType(String type) {
        this.type = type;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setIsControlled(boolean isControlled) {
        this.isControlled = isControlled;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Fire) {
                System.out.println("Fire ref will compare");
                Fire fire1 = this;
                Fire fire2 = (Fire) obj;

                if (fire1.type.equals(fire2.type) && fire1.temperature == fire2.temperature) {
                    System.out.println("Both fires have the same type and temperature");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Fire [type=" + type + ", temperature=" + temperature + ", isControlled=" + isControlled + ", source=" + source + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, temperature);
    }
}
