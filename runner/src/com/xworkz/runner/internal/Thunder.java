package com.xworkz.runner.internal;

public class Thunder {
    private int intensity;
    private String time;
    private boolean isRainAssociated;

    public Thunder(int intensity, String time, boolean isRainAssociated) {
        this.intensity = intensity;
        this.time = time;
        this.isRainAssociated = isRainAssociated;
    }

    @Override
    public String toString() {
        return "[intensity=" + intensity + ", time=" + time + ", isRainAssociated=" + isRainAssociated + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 1809;
    }
}
