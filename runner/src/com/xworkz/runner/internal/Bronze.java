package com.xworkz.runner.internal;

public class Bronze {
    private String grade;
    private double weight;
    private String origin;

    public Bronze(String grade, double weight, String origin) {
        this.grade = grade;
        this.weight = weight;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "[grade=" + grade + ", weight=" + weight + ", origin=" + origin + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 753;
    }
}
