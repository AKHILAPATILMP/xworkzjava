package com.xworkz.isarelation.thermostat;

public class Thermostat {
        public Thermostat() {
            System.out.println("Thermostat constructor is running");
        }

        public void turnOn() {
            System.out.println("Thermostat is turned on");
        }

        public void turnOff() {
            System.out.println("Thermostat is turned off");
        }

        public void setTemperature(int temperature) {
            System.out.println("Thermostat temperature set to " + temperature + "°C");
        }

        public void displayTemperature() {
            System.out.println("Displaying current temperature");
        }

        public void energySavingMode() {
            System.out.println("Thermostat is in energy-saving mode");
        }
    }

