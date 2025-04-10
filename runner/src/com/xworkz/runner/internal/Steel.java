package com.xworkz.runner.internal;

public class Steel {
    private String grade;
    private double thickness;
    private double cost;

    public Steel(String grade, double thickness, double cost) {
        this.grade = grade;
        this.thickness = thickness;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[grade=" + grade + ", thickness=" + thickness + ", cost=" + cost + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 651;
    }
}
