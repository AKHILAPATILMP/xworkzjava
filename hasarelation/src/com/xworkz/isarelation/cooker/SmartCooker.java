package com.xworkz.isarelation.cooker;
    public class SmartCooker extends Cooker {
        public SmartCooker() {
            super();
            System.out.println("SmartCooker constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartCooker is connecting to WiFi");
        }

        public void voiceControl() {
            System.out.println("SmartCooker is responding to voice commands");
        }

        public void autoCookingMode() {
            System.out.println("SmartCooker is in auto-cooking mode");
        }

        public void touchControl() {
            System.out.println("SmartCooker is using touch controls");
        }

        public void energySavingMode() {
            System.out.println("SmartCooker is in energy-saving mode");
        }
    }

