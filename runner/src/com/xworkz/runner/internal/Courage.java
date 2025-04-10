package com.xworkz.runner.internal;

public class Courage {
    private String source;
    private String expression;
    private double intensity;

    public Courage(String source, String expression, double intensity) {
        this.source = source;
        this.expression = expression;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "[source=" + source + ", expression=" + expression + ", intensity=" + intensity + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 784;
    }
}
