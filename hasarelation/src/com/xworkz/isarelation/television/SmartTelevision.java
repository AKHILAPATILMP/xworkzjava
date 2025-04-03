package com.xworkz.isarelation.television;
    public class SmartTelevision extends Television {
        public SmartTelevision() {
            super();
            System.out.println("SmartTelevision constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartTelevision is connecting to WiFi");
        }

        public void browseInternet() {
            System.out.println("SmartTelevision is browsing the internet");
        }

        public void streamOnlineContent() {
            System.out.println("SmartTelevision is streaming online content");
        }

        public void voiceControl() {
            System.out.println("SmartTelevision is responding to voice commands");
        }

        public void screenMirroring() {
            System.out.println("SmartTelevision is mirroring a screen");
        }
    }

