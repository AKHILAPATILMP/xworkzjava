package com.xworkz.isarelation.microwave;
    public class SmartMicrowave extends Microwave {
        public SmartMicrowave() {
            super();
            System.out.println("SmartMicrowave constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartMicrowave is connecting to WiFi");
        }

        public void voiceControl() {
            System.out.println("SmartMicrowave is responding to voice commands");
        }

        public void autoCookMode() {
            System.out.println("SmartMicrowave is in auto-cook mode");
        }

        public void touchControl() {
            System.out.println("SmartMicrowave is using touch controls");
        }

        public void energySavingMode() {
            System.out.println("SmartMicrowave is in energy-saving mode");
        }
    }

