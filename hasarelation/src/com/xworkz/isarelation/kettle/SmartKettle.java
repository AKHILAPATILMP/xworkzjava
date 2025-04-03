package com.xworkz.isarelation.kettle;

    public class SmartKettle extends Kettle {
        public SmartKettle() {
            super();
            System.out.println("SmartKettle constructor is running");
        }

        public void setTemperature() {
            System.out.println("SmartKettle is setting the desired water temperature");
        }

        public void autoShutOff() {
            System.out.println("SmartKettle is automatically shutting off when the water is boiled");
        }

        public void scheduleBoiling() {
            System.out.println("SmartKettle is scheduling boiling at a specific time");
        }

        public void keepWarm() {
            System.out.println("SmartKettle is keeping the water warm");
        }

        public void connectToApp() {
            System.out.println("SmartKettle is connected to a smartphone app for remote control");
        }
    }

