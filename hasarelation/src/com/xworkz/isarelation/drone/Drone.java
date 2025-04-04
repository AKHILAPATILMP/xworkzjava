package com.xworkz.isarelation.drone;

public class Drone {

    public Drone() {
        System.out.println("Drone constructor is running - parent class");
    }

    public void takeOff() {
        System.out.println("Drone is taking off - parent class");
    }

    public void fly() {
        System.out.println("Drone is flying - parent class");
    }

    public void land() {
        System.out.println("Drone is landing - parent class");
    }

    public void captureImage() {
        System.out.println("Drone is capturing image - parent class");
    }
}
