package com.xworkz.isarelation.fridge;

public class Fridge {

    public Fridge() {
        System.out.println("Fridge constructor is running - parent class");
    }

    public void coolItems() {
        System.out.println("Cooling items - parent class");
    }

    public void freeze() {
        System.out.println("Freezing items - parent class");
    }

    public void storeFood() {
        System.out.println("Storing food - parent class");
    }

    public void defrost() {
        System.out.println("Defrosting manually - parent class");
    }

    public void turnOn() {
        System.out.println("Fridge is turned on - parent class");
    }
}
