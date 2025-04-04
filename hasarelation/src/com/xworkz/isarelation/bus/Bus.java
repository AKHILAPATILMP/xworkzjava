package com.xworkz.isarelation.bus;
public class Bus {

    public Bus() {
        System.out.println("Bus constructor is running - parent class");
    }

    public void start() {
        System.out.println("Bus is starting - parent class");
    }

    public void stop() {
        System.out.println("Bus is stopping - parent class");
    }

    public void accelerate() {
        System.out.println("Bus is accelerating - parent class");
    }

    public void openDoors() {
        System.out.println("Bus doors are opening - parent class");
    }
}
