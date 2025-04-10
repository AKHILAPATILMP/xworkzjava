package com.xworkz.runner.internal;

public class Wardrobe {
    private int compartments;
    private String material;
    private boolean isMirrored;

    public Wardrobe(int compartments, String material, boolean isMirrored) {
        this.compartments = compartments;
        this.material = material;
        this.isMirrored = isMirrored;
    }

    @Override
    public String toString() {
        return "[compartments=" + compartments + ", material=" + material + ", isMirrored=" + isMirrored + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 3002;
    }
}
