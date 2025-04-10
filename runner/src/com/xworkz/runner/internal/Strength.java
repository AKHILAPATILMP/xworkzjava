package com.xworkz.runner.internal;

public class Strength {
    private String type;
    private int level;
    private boolean isMental;

    public Strength(String type, int level, boolean isMental) {
        this.type = type;
        this.level = level;
        this.isMental = isMental;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", level=" + level + ", isMental=" + isMental + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 712;
    }
}
