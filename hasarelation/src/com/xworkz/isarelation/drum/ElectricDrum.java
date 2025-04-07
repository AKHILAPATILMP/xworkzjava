package com.xworkz.isarelation.drum;

public class ElectricDrum extends Drum {

    public ElectricDrum() {
        super();
        System.out.println("ElectricDrum constructor is running - subclass");
    }

    @Override
    public void hit() {
        System.out.println("ElectricDrum is hit electronically - subclass");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting volume with digital controls - subclass");
    }

    @Override
    public void playRhythm() {
        System.out.println("Playing rhythm with preset beats - subclass");
    }

    @Override
    public void changeDrumHead() {
        System.out.println("ElectricDrum head is replaced digitally - subclass");
    }

    @Override
    public void cleanDrum() {
        System.out.println("ElectricDrum is auto-cleaning - subclass");
    }

    public void connectToAmp() {
        System.out.println("ElectricDrum connected to amplifier - subclass only");
    }
}
