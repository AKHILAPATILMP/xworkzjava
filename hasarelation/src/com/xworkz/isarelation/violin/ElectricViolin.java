package com.xworkz.isarelation.violin;


    public class ElectricViolin extends Violin {
        public ElectricViolin() {
            super();
            System.out.println("ElectricViolin constructor is running");
        }

        public void connectToAmplifier() {
            System.out.println("Electric Violin is connected to an amplifier");
        }

        public void enableReverbEffect() {
            System.out.println("Electric Violin is using reverb effect");
        }

        public void changeToneSettings() {
            System.out.println("Electric Violin tone settings are adjusted");
        }

        public void recordPerformance() {
            System.out.println("Electric Violin is recording the performance");
        }

        public void enableBluetooth() {
            System.out.println("Electric Violin is connected via Bluetooth");
        }
    }

