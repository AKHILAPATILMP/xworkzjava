package com.xworkz.isarelation.guitar;

public class ElectricGuitar extends Guitar {

    public ElectricGuitar() {
        super();
        System.out.println("ElectricGuitar constructor is running - subclass");
    }

    @Override
    public void play() {
        System.out.println("Playing electric guitar with amplifier - subclass");
    }

    @Override
    public void tune() {
        System.out.println("Tuning electric guitar with digital tuner - subclass");
    }

    @Override
    public void changeStrings() {
        System.out.println("Changing strings of electric guitar - subclass");
    }

    @Override
    public void carry() {
        System.out.println("Carrying electric guitar with padded case - subclass");
    }

    @Override
    public void clean() {
        System.out.println("Polishing electric guitar with cleaner - subclass");
    }

    public void plugInAmp() {
        System.out.println("Plugging electric guitar into amplifier - subclass");
    }
}
