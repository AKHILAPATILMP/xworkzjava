package com.xworkz.equals.internal;

import java.util.Objects;

public class Jetliner {
    private String model;
    private int capacity;
    private double range;
    private String airline;

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Jetliner) {
                System.out.println("Jetliner ref will compare");
                Jetliner jl1 = this;
                Jetliner jl2 = (Jetliner) obj;

                if (jl1.model.equals(jl2.model) && jl1.airline.equals(jl2.airline)) {
                    System.out.println("Both Jetliners have the same model and airline");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Jetliner [model=" + model + ", capacity=" + capacity + ", range=" + range + ", airline=" + airline + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, capacity, range, airline);
    }
}
