package com.xworkz.runner.internal;

public class Touch { private String surface;
    private double pressure;
    private boolean isWarm;

    public Touch(String surface, double pressure, boolean isWarm) {
        this.surface = surface;
        this.pressure = pressure;
        this.isWarm = isWarm;
    }

    @Override
    public String toString() {
        return "[surface=" + surface + ", pressure=" + pressure + "N, isWarm=" + isWarm + "]";
    }

}
