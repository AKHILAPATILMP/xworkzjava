package com.xworkz.isarelation.pilot;
public class Pilot {

    public Pilot() {
        System.out.println("Pilot constructor is running - parent class");
    }

    public void fly() {
        System.out.println("Pilot is flying a plane - parent class");
    }

    public void land() {
        System.out.println("Pilot is landing the plane - parent class");
    }

    public void communicate() {
        System.out.println("Pilot is communicating with ATC - parent class");
    }

    public void performCheck() {
        System.out.println("Pilot is performing pre-flight checks - parent class");
    }
}

