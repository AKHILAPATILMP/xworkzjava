package com.xworkz.isarelation.jet;

public class Jet {

    public Jet() {
        System.out.println("Jet constructor is running - parent class");
    }

    public void fly() {
        System.out.println("Jet is flying - parent class");
    }

    public void land() {
        System.out.println("Jet is landing - parent class");
    }

    public void refuel() {
        System.out.println("Jet is refueling - parent class");
    }

    public void checkSystems() {
        System.out.println("Jet system check - parent class");
    }

    public void communicate() {
        System.out.println("Jet communicating with control tower - parent class");
    }
}
