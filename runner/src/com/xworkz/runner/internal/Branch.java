package com.xworkz.runner.internal;

public class Branch {
    private int type;
    private double length;
    private String treeName;

    public Branch(int type, double length, String treeName) {
        this.type = type;
        this.length = length;
        this.treeName = treeName;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", length=" + length + ", treeName=" + treeName + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 246;
    }
}
