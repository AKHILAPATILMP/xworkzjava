package com.xworkz.isarelation.piano;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Piano");
        Piano piano = new Piano();
        piano.play();
        piano.stop();
        piano.tune();
        piano.showKeys();

        System.out.println("\nCreating an instance of ElectricPiano using Piano reference");
        Piano pianoRef = new ElectricPiano();
        pianoRef.play();
        pianoRef.stop();
        pianoRef.tune();
        pianoRef.showKeys();

        System.out.println("\nCreating an instance of ElectricPiano using subclass reference");
        ElectricPiano electricPiano = new ElectricPiano();
        electricPiano.play();
        electricPiano.stop();
        electricPiano.tune();
        electricPiano.showKeys();
    }
}


