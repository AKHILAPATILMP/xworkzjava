package com.xworkz.isarelation.speaker;

    public class SmartSpeaker extends Speaker {
        public SmartSpeaker() {
            super();
            System.out.println("SmartSpeaker constructor is running");
        }

        public void connectBluetooth() {
            System.out.println("SmartSpeaker is connecting via Bluetooth");
        }

        public void voiceAssistant() {
            System.out.println("SmartSpeaker is responding to voice commands");
        }

        public void streamMusic() {
            System.out.println("SmartSpeaker is streaming music online");
        }

        public void controlSmartHome() {
            System.out.println("SmartSpeaker is controlling smart home devices");
        }

        public void enableWiFi() {
            System.out.println("SmartSpeaker is connecting to WiFi");
        }
    }

