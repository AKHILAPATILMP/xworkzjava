package com.xworkz.runner.internal;

public class Airplane {
    private String airline;
    private int capacity;
    private double ticketPrice;

    public Airplane(String airline, int capacity, double ticketPrice) {
        this.airline = airline;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "[airline=" + airline + ", capacity=" + capacity + ", ticketPrice=" + ticketPrice + "]";
    }
    @Override
    public int hashCode(){
        System.out.println("value "+super.hashCode());
        return 150;
    }
}
