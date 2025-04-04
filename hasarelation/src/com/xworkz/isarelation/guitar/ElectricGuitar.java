package com.xworkz.isarelation.guitar;
public class ElectricGuitar extends Guitar {

    public ElectricGuitar() {
        super();
        System.out.println("ElectricGuitar constructor is running - subclass");
    }

    @Override
    public void play() {
        System.out.println("Playing an electric guitar with amplifier - subclass");
    }

    @Override
    public void tune() {
        System.out.println("Auto-tuning electric guitar - subclass");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning electric guitar with care - subclass");
    }

    @Override
    public void displayType() {
        System.out.println("This is a modern electric guitar - subclass");
    }
}
