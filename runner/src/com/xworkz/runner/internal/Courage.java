package com.xworkz.runner.internal;

public class Courage {
    private String challengeFaced;
    private String sourceOfStrength;
    private int riskLevel;

    public Courage(String challengeFaced, String sourceOfStrength, int riskLevel) {
        this.challengeFaced = challengeFaced;
        this.sourceOfStrength = sourceOfStrength;
        this.riskLevel = riskLevel;
    }

    @Override
    public String toString() {
        return "[challengeFaced=" + challengeFaced + ", sourceOfStrength=" + sourceOfStrength + ", riskLevel=" + riskLevel + "]";
    }
}
