package com.xworkz.runner.internal;

public class Drawer {
    private String material;
    private int compartments;
    private boolean lockable;

    public Drawer(String material, int compartments, boolean lockable) {
        this.material = material;
        this.compartments = compartments;
        this.lockable = lockable;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", compartments=" + compartments + ", lockable=" + lockable + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 555;
    }
}
