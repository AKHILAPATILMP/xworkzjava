package com.xworkz.runner.internal;

public class Strength {
    private String physicalAbility;
    private String mentalToughness;
    private int enduranceScore;

    public Strength(String physicalAbility, String mentalToughness, int enduranceScore) {
        this.physicalAbility = physicalAbility;
        this.mentalToughness = mentalToughness;
        this.enduranceScore = enduranceScore;
    }

    @Override
    public String toString() {
        return "[physicalAbility=" + physicalAbility + ", mentalToughness=" + mentalToughness + ", enduranceScore=" + enduranceScore + "]";
    }
}
