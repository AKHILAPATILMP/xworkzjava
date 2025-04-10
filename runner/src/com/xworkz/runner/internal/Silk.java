package com.xworkz.runner.internal;

public class Silk {
    private String origin;
    private String texture;
    private double costPerMeter;

    public Silk(String origin, String texture, double costPerMeter) {
        this.origin = origin;
        this.texture = texture;
        this.costPerMeter = costPerMeter;
    }

    @Override
    public String toString() {
        return "[origin=" + origin + ", texture=" + texture + ", costPerMeter=" + costPerMeter + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 521;
    }
}
