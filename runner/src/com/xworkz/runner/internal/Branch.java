package com.xworkz.runner.internal;

public class Branch {
    private int numberOfLeaves;
    private double length;
    private String positionOnTree;

    public Branch(int numberOfLeaves, double length, String positionOnTree) {
        this.numberOfLeaves = numberOfLeaves;
        this.length = length;
        this.positionOnTree = positionOnTree;
    }

    @Override
    public String toString() {
        return "[numberOfLeaves=" + numberOfLeaves + ", length=" + length + " cm, positionOnTree=" + positionOnTree + "]";
    }
}
