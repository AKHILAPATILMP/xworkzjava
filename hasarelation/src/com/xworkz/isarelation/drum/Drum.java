package com.xworkz.isarelation.drum;
public class Drum {

    public Drum() {
        System.out.println("Drum constructor is running - parent class");
    }

    public void play() {
        System.out.println("Playing the drum - parent class");
    }

    public void tune() {
        System.out.println("Tuning the drum - parent class");
    }

    public void carry() {
        System.out.println("Carrying the drum - parent class");
    }

    public void displayType() {
        System.out.println("This is an acoustic drum - parent class");
    }
}
