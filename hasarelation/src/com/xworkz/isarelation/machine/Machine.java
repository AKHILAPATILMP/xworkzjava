package com.xworkz.isarelation.machine;

public class Machine {

    public Machine() {
        System.out.println("Machine constructor is running - parent class");
    }

    public void start() {
        System.out.println("Machine is starting - parent class");
    }

    public void stop() {
        System.out.println("Machine is stopping - parent class");
    }

    public void operate() {
        System.out.println("Machine is operating - parent class");
    }

    public void maintenance() {
        System.out.println("Performing machine maintenance - parent class");
    }
}
