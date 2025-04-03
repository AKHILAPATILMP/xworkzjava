package com.xworkz.isarelation.car;

    public class TeslaCar extends Car {
        public TeslaCar() {
            super();
            System.out.println("TeslaCar constructor is running");
        }

        public void autopilot() {
            System.out.println("TeslaCar is in autopilot mode");
        }

        public void electricDrive() {
            System.out.println("TeslaCar is running on an electric drive");
        }

        public void selfParking() {
            System.out.println("TeslaCar is self-parking");
        }

        public void voiceControl() {
            System.out.println("TeslaCar is responding to voice commands");
        }

        public void regenerativeBraking() {
            System.out.println("TeslaCar is using regenerative braking");
        }
    }

