package com.xworkz.runner.internal;

public class Machine {
    private String type;
    private String purpose;
    private double cost;

    public Machine(String type, String purpose, double cost) {
        this.type = type;
        this.purpose = purpose;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", purpose=" + purpose + ", cost=" + cost + "]";
    }
}
