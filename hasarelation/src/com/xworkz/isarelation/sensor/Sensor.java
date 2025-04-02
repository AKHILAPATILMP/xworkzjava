package com.xworkz.isarelation.sensor;

public class Sensor {

        public Sensor() {
            System.out.println("Sensor constructor is running");
        }

        public void detect() {
            System.out.println("Sensor: Detecting environmental changes...");
        }

        public void calibrate() {
            System.out.println("Sensor: Calibrating sensor...");
        }

        public void sendData() {
            System.out.println("Sensor: Sending data to system...");
        }

        public void analyzeData() {
            System.out.println("Sensor: Analyzing collected data...");
        }

        public void alert() {
            System.out.println("Sensor: Triggering an alert if needed...");
        }
    }

