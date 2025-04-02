package com.xworkz.isarelation.helmet;

    public class SmartHelmet extends Helmet {
        public SmartHelmet() {
            super();
            System.out.println("SmartHelmet constructor is running");
        }

        public void bluetoothConnectivity() {
            System.out.println("SmartHelmet: Connecting via Bluetooth...");
        }

        public void gpsNavigation() {
            System.out.println("SmartHelmet: Providing GPS navigation...");
        }

        public void voiceControl() {
            System.out.println("SmartHelmet: Enabling voice commands...");
        }

        public void emergencyAlert() {
            System.out.println("SmartHelmet: Sending emergency alerts in case of an accident...");
        }

        public void rearViewCamera() {
            System.out.println("SmartHelmet: Displaying rear-view camera feed...");
        }
    }

