package com.xworkz.isarelation.drum;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of ElectricDrum using Drum reference");
            Drum drumRef = new ElectricDrum();
            drumRef.play();
            drumRef.tune();
            drumRef.hitDrum();
            drumRef.adjustVolume();
            drumRef.useDrumsticks();

            System.out.println("\nCreating an instance of ElectricDrum using subclass reference");
            ElectricDrum electricDrum = new ElectricDrum();
            electricDrum.play();
            electricDrum.tune();
            electricDrum.hitDrum();
            electricDrum.adjustVolume();
            electricDrum.useDrumsticks();
            electricDrum.connectToSpeaker();
            electricDrum.changeDrumKitSound();
            electricDrum.enableElectronicEffects();
            electricDrum.recordPerformance();
            electricDrum.adjustSensitivity();
        }
    }

