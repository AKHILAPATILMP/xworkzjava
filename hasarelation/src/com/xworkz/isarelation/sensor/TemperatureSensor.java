package com.xworkz.isarelation.sensor;

    public class TemperatureSensor extends Sensor {
        public TemperatureSensor() {
            super();
            System.out.println("TemperatureSensor constructor is running");
        }

        public void measureTemperature() {
            System.out.println("TemperatureSensor: Measuring temperature...");
        }

        public void overheatWarning() {
            System.out.println("TemperatureSensor: Warning! Temperature too high...");
        }

        public void coldWarning() {
            System.out.println("TemperatureSensor: Warning! Temperature too low...");
        }

        public void adjustSettings() {
            System.out.println("TemperatureSensor: Adjusting settings for optimal performance...");
        }

        public void storeTemperatureData() {
            System.out.println("TemperatureSensor: Storing temperature data for analysis...");
        }
    }

