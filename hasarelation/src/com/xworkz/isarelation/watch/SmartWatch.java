package com.xworkz.isarelation.watch;

    public class SmartWatch extends Watch {
        public SmartWatch() {
            super();
            System.out.println("SmartWatch constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartWatch is connecting to WiFi");
        }

        public void trackHeartRate() {
            System.out.println("SmartWatch is tracking heart rate");
        }

        public void receiveCalls() {
            System.out.println("SmartWatch is receiving calls");
        }

        public void playMusic() {
            System.out.println("SmartWatch is playing music");
        }

        public void trackFitness() {
            System.out.println("SmartWatch is tracking fitness activity");
        }
    }

