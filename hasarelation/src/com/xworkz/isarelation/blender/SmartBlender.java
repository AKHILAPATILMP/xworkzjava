package com.xworkz.isarelation.blender;

    public class SmartBlender extends Blender {
        public SmartBlender() {
            super();
            System.out.println("SmartBlender constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartBlender is connecting to WiFi");
        }

        public void voiceControl() {
            System.out.println("SmartBlender is responding to voice commands");
        }

        public void autoBlendMode() {
            System.out.println("SmartBlender is in auto-blend mode");
        }

        public void touchControl() {
            System.out.println("SmartBlender is using touch controls");
        }

        public void energySavingMode() {
            System.out.println("SmartBlender is in energy-saving mode");
        }
    }

