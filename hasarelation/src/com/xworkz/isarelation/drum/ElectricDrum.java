package com.xworkz.isarelation.drum;

public class ElectricDrum extends Drum {

    public ElectricDrum() {
        super();
        System.out.println("ElectricDrum constructor is running - subclass");
    }

    @Override
    public void play() {
        System.out.println("Playing the electric drum with digital sound - subclass");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the electric drum with settings - subclass");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the lightweight electric drum - subclass");
    }

    @Override
    public void displayType() {
        System.out.println("This is an electric drum - subclass");
    }
}

