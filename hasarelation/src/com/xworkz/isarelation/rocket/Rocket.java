package com.xworkz.isarelation.rocket;

public class Rocket {

    public Rocket() {
        System.out.println("Rocket constructor is running - parent class");
    }

    public void launch() {
        System.out.println("Rocket is launching - parent class");
    }

    public void land() {
        System.out.println("Rocket is landing - parent class");
    }

    public void refuel() {
        System.out.println("Rocket is refueling - parent class");
    }

    public void statusCheck() {
        System.out.println("Rocket systems are being checked - parent class");
    }
}

