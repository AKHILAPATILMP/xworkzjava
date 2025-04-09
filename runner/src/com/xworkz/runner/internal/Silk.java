package com.xworkz.runner.internal;

public class Silk {
    private String origin;
    private String texture;
    private double pricePerMeter;

    public Silk(String origin, String texture, double pricePerMeter) {
        this.origin = origin;
        this.texture = texture;
        this.pricePerMeter = pricePerMeter;
    }

    @Override
    public String toString() {
        return "[origin=" + origin + ", texture=" + texture + ", pricePerMeter=" + pricePerMeter + "]";
    }
}
