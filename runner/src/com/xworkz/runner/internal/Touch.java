package com.xworkz.runner.internal;

public class Touch {
    private String type;
    private boolean soft;
    private double duration;

    public Touch(String type, boolean soft, double duration) {
        this.type = type;
        this.soft = soft;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", soft=" + soft + ", duration=" + duration + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 6875;
    }
}
