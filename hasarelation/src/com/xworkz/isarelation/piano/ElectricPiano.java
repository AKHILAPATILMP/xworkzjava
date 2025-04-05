package com.xworkz.isarelation.piano;
public class ElectricPiano extends Piano {

    public ElectricPiano() {
        super();
        System.out.println("ElectricPiano constructor is running - subclass");
    }

    @Override
    public void play() {
        System.out.println("Playing electric piano with digital sound - subclass");
    }

    @Override
    public void stop() {
        System.out.println("Stopping electric piano - subclass");
    }

    @Override
    public void tune() {
        System.out.println("Auto-tuning electric piano - subclass");
    }

    @Override
    public void showKeys() {
        System.out.println("Displaying backlit keys on electric piano - subclass");
    }
}


