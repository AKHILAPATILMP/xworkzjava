package com.xworkz.isarelation.toaster;

public class Toaster {

    public Toaster() {
        System.out.println("Toaster constructor is running - parent class");
    }

    public void turnOn() {
        System.out.println("Turning on the toaster - parent class");
    }

    public void turnOff() {
        System.out.println("Turning off the toaster - parent class");
    }

    public void toastBread() {
        System.out.println("Toasting bread at basic setting - parent class");
    }

    public void eject() {
        System.out.println("Ejecting toasted bread - parent class");
    }
}

