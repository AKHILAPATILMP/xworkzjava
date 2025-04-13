package com.xworkz.equals.internal;

import java.util.Objects;

public class Battery {
    private String type;
    private int capacity;
    private double voltage;
    private String usage;

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is  not null");

            if (obj instanceof Battery) {
                System.out.println("Battery ref will compare");
                Battery b1 = this;
                Battery b2 = (Battery) obj;

                if (b1.type.equals(b2.type)) {
                    System.out.println("Both batteries have the same type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Battery [type=" + type + ", capacity=" + capacity + ", voltage=" + voltage + ", usage=" + usage + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, voltage, usage);
    }
}
