package com.xworkz.isarelation.fan;
    public class SmartFan extends Fan {
        public SmartFan() {
            super();
            System.out.println("SmartFan constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartFan is connecting to WiFi");
        }

        public void controlWithApp() {
            System.out.println("SmartFan is being controlled via mobile app");
        }

        public void voiceControl() {
            System.out.println("SmartFan is responding to voice commands");
        }

        public void energySavingMode() {
            System.out.println("SmartFan is in energy-saving mode");
        }

        public void scheduleTimer() {
            System.out.println("SmartFan is scheduled to turn on/off at a specific time");
        }
    }

