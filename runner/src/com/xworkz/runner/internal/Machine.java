package com.xworkz.runner.internal;

public class Machine {
    private String name;
    private String function;
    private double weight;

    public Machine(String name, String function, double weight) {
        this.name = name;
        this.function = function;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", function=" + function + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 987;
    }
}
