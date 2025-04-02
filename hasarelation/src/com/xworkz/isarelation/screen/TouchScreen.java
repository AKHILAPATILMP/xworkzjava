package com.xworkz.isarelation.screen;

    public class TouchScreen extends Screen {
        public TouchScreen() {
            super();
            System.out.println("TouchScreen constructor is running");
        }

        public void detectTouch() {
            System.out.println("TouchScreen: Detecting touch input...");
        }

        public void multiTouchSupport() {
            System.out.println("TouchScreen: Supporting multi-touch functionality...");
        }

        public void gestureControl() {
            System.out.println("TouchScreen: Enabling gesture control...");
        }

        public void stylusSupport() {
            System.out.println("TouchScreen: Supporting stylus input...");
        }

        public void fingerprintSensor() {
            System.out.println("TouchScreen: Scanning fingerprint for authentication...");
        }
    }

