package com.xworkz.isarelation.smartcar;
    public class ElectricSmartCar extends SmartCar {
        public ElectricSmartCar() {
            super();
            System.out.println("ElectricSmartCar constructor is running");
        }

        public void chargeBattery() {
            System.out.println("ElectricSmartCar is charging its battery");
        }

        public void autopilot() {
            System.out.println("ElectricSmartCar is driving on autopilot mode");
        }

        public void ecoMode() {
            System.out.println("ElectricSmartCar is in eco mode");
        }

        public void selfParking() {
            System.out.println("ElectricSmartCar is performing self-parking");
        }

        public void voiceControl() {
            System.out.println("ElectricSmartCar is responding to voice commands");
        }
    }

