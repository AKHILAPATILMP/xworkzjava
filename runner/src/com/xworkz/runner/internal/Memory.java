package com.xworkz.runner.internal;

public class Memory {
    private String type;
    private int sizeInGB;
    private double speedMHz;

    public Memory(String type, int sizeInGB, double speedMHz) {
        this.type = type;
        this.sizeInGB = sizeInGB;
        this.speedMHz = speedMHz;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", sizeInGB=" + sizeInGB + ", speedMHz=" + speedMHz + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 786;
    }
}
