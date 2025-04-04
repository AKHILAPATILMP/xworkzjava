package com.xworkz.isarelation.drum;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Drum");
        Drum drum = new Drum();
        drum.play();
        drum.tune();
        drum.carry();
        drum.displayType();

        System.out.println("\nCreating an instance of ElectricDrum using Drum reference");
        Drum drumRef = new ElectricDrum();
        drumRef.play();
        drumRef.tune();
        drumRef.carry();
        drumRef.displayType();

        System.out.println("\nCreating an instance of ElectricDrum using subclass reference");
        ElectricDrum electricDrum = new ElectricDrum();
        electricDrum.play();
        electricDrum.tune();
        electricDrum.carry();
        electricDrum.displayType();
    }
}


