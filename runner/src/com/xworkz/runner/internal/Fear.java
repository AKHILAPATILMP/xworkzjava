package com.xworkz.runner.internal;

public class Fear {
    private String type;
    private int intensity;
    private String trigger;

    public Fear(String type, int intensity, String trigger) {
        this.type = type;
        this.intensity = intensity;
        this.trigger = trigger;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", intensity=" + intensity + ", trigger=" + trigger + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 505;
    }
}
