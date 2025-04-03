package com.xworkz.isarelation.skateboard;

    public class ElectricSkateboard extends Skateboard {
        public ElectricSkateboard() {
            super();
            System.out.println("ElectricSkateboard constructor is running");
        }

        public void accelerate() {
            System.out.println("Electric skateboard is accelerating");
        }

        public void brake() {
            System.out.println("Electric skateboard is braking");
        }

        public void checkBattery() {
            System.out.println("Checking electric skateboard battery level");
        }

        public void enableCruiseControl() {
            System.out.println("Electric skateboard cruise control is activated");
        }

        public void connectToApp() {
            System.out.println("Electric skateboard is connecting to a mobile app");
        }
    }

