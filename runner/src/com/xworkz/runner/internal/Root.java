package com.xworkz.runner.internal;

public class Root {
    private String plantType;
    private double depth;
    private String function;

    public Root(String plantType, double depth, String function) {
        this.plantType = plantType;
        this.depth = depth;
        this.function = function;
    }

    @Override
    public String toString() {
        return "[plantType=" + plantType + ", depth=" + depth + ", function=" + function + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 503;
    }
}
