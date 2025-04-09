package com.xworkz.runner.internal;

public class Bronze {
    private double copperPercentage;
    private double tinPercentage;
    private String useCase;

    public Bronze(double copperPercentage, double tinPercentage, String useCase) {
        this.copperPercentage = copperPercentage;
        this.tinPercentage = tinPercentage;
        this.useCase = useCase;
    }

    @Override
    public String toString() {
        return "[copper=" + copperPercentage + "%, tin=" + tinPercentage + "%, useCase=" + useCase + "]";
    }
}
