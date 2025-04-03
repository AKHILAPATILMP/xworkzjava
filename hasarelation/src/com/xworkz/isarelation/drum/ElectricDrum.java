package com.xworkz.isarelation.drum;

    public class ElectricDrum extends Drum {
        public ElectricDrum() {
            super();
            System.out.println("ElectricDrum constructor is running");
        }

        public void connectToSpeaker() {
            System.out.println("Electric Drum is connected to a speaker");
        }

        public void changeDrumKitSound() {
            System.out.println("Electric Drum is changing drum kit sound");
        }

        public void enableElectronicEffects() {
            System.out.println("Electric Drum is using electronic effects");
        }

        public void recordPerformance() {
            System.out.println("Electric Drum is recording the performance");
        }

        public void adjustSensitivity() {
            System.out.println("Electric Drum sensitivity is adjusted");
        }
    }

