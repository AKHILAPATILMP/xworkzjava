package com.xworkz.runner.internal;

public class Grace {
    private String style;
    private String expression;
    private double eleganceLevel;

    public Grace(String style, String expression, double eleganceLevel) {
        this.style = style;
        this.expression = expression;
        this.eleganceLevel = eleganceLevel;
    }

    @Override
    public String toString() {
        return "[style=" + style + ", expression=" + expression + ", eleganceLevel=" + eleganceLevel + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 888;
    }
}
