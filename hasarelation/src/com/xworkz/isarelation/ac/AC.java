package com.xworkz.isarelation.ac;

public class AC {
        public AC() {
            System.out.println("AC constructor is running");
        }

        public void turnOn() {
            System.out.println("AC is turned on");
        }

        public void turnOff() {
            System.out.println("AC is turned off");
        }

        public void setTemperature(int temperature) {
            System.out.println("AC temperature is set to " + temperature + "°C");
        }

        public void enableCooling() {
            System.out.println("AC is in cooling mode");
        }

        public void enableHeating() {
            System.out.println("AC is in heating mode");
        }
    }

