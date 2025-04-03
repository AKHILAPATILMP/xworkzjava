package com.xworkz.isarelation.toaster;

    public class SmartToaster extends Toaster {
        public SmartToaster() {
            super();
            System.out.println("SmartToaster constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartToaster is connecting to WiFi");
        }

        public void voiceControl() {
            System.out.println("SmartToaster is responding to voice commands");
        }

        public void adjustBrowningLevel() {
            System.out.println("SmartToaster is adjusting browning level");
        }

        public void touchControl() {
            System.out.println("SmartToaster is using touch controls");
        }

        public void energySavingMode() {
            System.out.println("SmartToaster is in energy-saving mode");
        }
    }

