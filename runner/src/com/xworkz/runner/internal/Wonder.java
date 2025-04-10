package com.xworkz.runner.internal;

public class Wonder {
    private String name;
    private String location;
    private boolean isNatural;

    public Wonder(String name, String location, boolean isNatural) {
        this.name = name;
        this.location = location;
        this.isNatural = isNatural;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", location=" + location + ", isNatural=" + isNatural + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 3006;
    }
}
