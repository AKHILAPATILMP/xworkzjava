package com.xworkz.isarelation.bulb;
    public class SmartBulb extends Bulb {
        public SmartBulb() {
            super();
            System.out.println("SmartBulb constructor is running");
        }

        public void changeColor() {
            System.out.println("SmartBulb is changing color");
        }

        public void connectToWiFi() {
            System.out.println("SmartBulb is connecting to WiFi");
        }

        public void voiceControl() {
            System.out.println("SmartBulb is responding to voice commands");
        }

        public void scheduleTimer() {
            System.out.println("SmartBulb timer is set for automatic operation");
        }

        public void adjustBrightness() {
            System.out.println("SmartBulb brightness is being adjusted");
        }
    }

