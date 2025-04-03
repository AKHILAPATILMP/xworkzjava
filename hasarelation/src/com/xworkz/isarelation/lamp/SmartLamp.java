package com.xworkz.isarelation.lamp;
    public class SmartLamp extends Lamp {
        public SmartLamp() {
            super();
            System.out.println("SmartLamp constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartLamp is connecting to WiFi");
        }

        public void changeColor() {
            System.out.println("SmartLamp is changing colors");
        }

        public void voiceControl() {
            System.out.println("SmartLamp is responding to voice commands");
        }

        public void scheduleLighting() {
            System.out.println("SmartLamp is scheduled to turn on/off at a specific time");
        }

        public void energySavingMode() {
            System.out.println("SmartLamp is in energy-saving mode");
        }
    }

