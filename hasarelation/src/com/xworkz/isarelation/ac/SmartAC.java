package com.xworkz.isarelation.ac;
    public class SmartAC extends AC {
        public SmartAC() {
            super();
            System.out.println("SmartAC constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartAC is connecting to WiFi");
        }

        public void controlWithApp() {
            System.out.println("SmartAC is being controlled via mobile app");
        }

        public void voiceControl() {
            System.out.println("SmartAC is responding to voice commands");
        }

        public void energySavingMode() {
            System.out.println("SmartAC is in energy-saving mode");
        }

        public void autoAdjustTemperature() {
            System.out.println("SmartAC is automatically adjusting the temperature based on the room conditions");
        }
    }

