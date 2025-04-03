package com.xworkz.isarelation.piano;

public class ElectricPiano extends Piano {
    public ElectricPiano() {
        super();
        System.out.println("ElectricPiano constructor is running");
    }

    public void connectToSpeaker() {
        System.out.println("Electric Piano is connected to a speaker");
    }

    public void enableSynthMode() {
        System.out.println("Electric Piano is in synth mode");
    }

    public void changeInstrumentSound() {
        System.out.println("Electric Piano is changing instrument sound");
    }

    public void recordPerformance() {
        System.out.println("Electric Piano is recording the performance");
    }

    public void enableBluetooth() {
        System.out.println("Electric Piano is connected via Bluetooth");
    }
}

