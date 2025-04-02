package com.xworkz.isarelation.autocar;

    public class TeslaCar extends AutoCar {
        public TeslaCar() {
            super();
            System.out.println("TeslaCar constructor is running");
        }

        public void autopilot() {
            System.out.println("Autopilot mode is enabled");
        }

        public void electricDrive() {
            System.out.println("Car is running on electric drive");
        }

        public void selfParking() {
            System.out.println("Car is self-parking");
        }

        public void voiceControl() {
            System.out.println("Car is responding to voice commands");
        }

        public void regenerativeBraking() {
            System.out.println("Regenerative braking is in action");
        }
    }


