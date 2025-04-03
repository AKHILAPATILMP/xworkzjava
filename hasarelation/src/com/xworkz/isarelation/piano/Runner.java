package com.xworkz.isarelation.piano;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of ElectricPiano using Piano reference");
            Piano pianoRef = new ElectricPiano();
            pianoRef.play();
            pianoRef.tune();
            pianoRef.pressKeys();
            pianoRef.sustainPedal();
            pianoRef.adjustVolume();

            System.out.println("\nCreating an instance of ElectricPiano using subclass reference");
            ElectricPiano electricPiano = new ElectricPiano();
            electricPiano.play();
            electricPiano.tune();
            electricPiano.pressKeys();
            electricPiano.sustainPedal();
            electricPiano.adjustVolume();
            electricPiano.connectToSpeaker();
            electricPiano.enableSynthMode();
            electricPiano.changeInstrumentSound();
            electricPiano.recordPerformance();
            electricPiano.enableBluetooth();
        }
    }

