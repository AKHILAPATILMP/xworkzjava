package com.xworkz.isarelation.trafficlight;

public class TrafficLight {

        public TrafficLight() {
            System.out.println("TrafficLight constructor is running");
        }

        public void showRed() {
            System.out.println("TrafficLight is showing RED - Stop");
        }

        public void showYellow() {
            System.out.println("TrafficLight is showing YELLOW - Get Ready");
        }

        public void showGreen() {
            System.out.println("TrafficLight is showing GREEN - Go");
        }

        public void blinkYellow() {
            System.out.println("TrafficLight is blinking YELLOW - Proceed with caution");
        }

        public void emergencyMode() {
            System.out.println("TrafficLight is in emergency flashing mode");
        }
    }


