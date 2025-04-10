package com.xworkz.runner.internal;

public class Echo {
    private String source;
    private double delayTime;
    private String environment;

    public Echo(String source, double delayTime, String environment) {
        this.source = source;
        this.delayTime = delayTime;
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "[source=" + source + ", delayTime=" + delayTime + ", environment=" + environment + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 404;
    }
}
