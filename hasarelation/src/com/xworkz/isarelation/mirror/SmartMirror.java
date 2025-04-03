package com.xworkz.isarelation.mirror;
    public class SmartMirror extends Mirror {
        public SmartMirror() {
            super();
            System.out.println("SmartMirror constructor is running");
        }

        public void displayWeather() {
            System.out.println("SmartMirror is displaying the weather");
        }

        public void playMusic() {
            System.out.println("SmartMirror is playing music");
        }

        public void showTime() {
            System.out.println("SmartMirror is displaying the time");
        }

        public void connectToWiFi() {
            System.out.println("SmartMirror is connecting to WiFi");
        }

        public void touchControl() {
            System.out.println("SmartMirror is responding to touch controls");
        }
    }

