package com.xworkz.isarelation.flute;

public class ElectricFlute extends Flute {

    public ElectricFlute() {
        super();
        System.out.println("ElectricFlute constructor is running - subclass");
    }

    @Override
    public void play() {
        System.out.println("Playing electric flute with effects - subclass");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning electric flute with care - subclass");
    }

    @Override
    public void tune() {
        System.out.println("Digitally tuning the electric flute - subclass");
    }

    @Override
    public void store() {
        System.out.println("Storing electric flute with charger - subclass");
    }

    @Override
    public void transport() {
        System.out.println("Transporting electric flute in padded case - subclass");
    }

    public void charge() {
        System.out.println("Charging the electric flute - subclass only method");
    }
}
