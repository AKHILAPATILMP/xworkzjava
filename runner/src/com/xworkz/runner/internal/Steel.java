package com.xworkz.runner.internal;

public class Steel {
    private String grade;
    private int tensileStrength;
    private double carbonContent;

    public Steel(String grade, int tensileStrength, double carbonContent) {
        this.grade = grade;
        this.tensileStrength = tensileStrength;
        this.carbonContent = carbonContent;
    }

    @Override
    public String toString() {
        return "[grade=" + grade + ", tensileStrength=" + tensileStrength + " MPa, carbonContent=" + carbonContent + "%]";
    }
}
