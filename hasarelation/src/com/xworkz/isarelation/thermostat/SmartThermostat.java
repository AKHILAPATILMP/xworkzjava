package com.xworkz.isarelation.thermostat;
    public class SmartThermostat extends Thermostat {
        public SmartThermostat() {
            super();
            System.out.println("SmartThermostat constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartThermostat is connecting to WiFi");
        }

        public void remoteControl() {
            System.out.println("SmartThermostat is controlled remotely via an app");
        }

        public void voiceControl() {
            System.out.println("SmartThermostat is responding to voice commands");
        }

        public void autoAdjust() {
            System.out.println("SmartThermostat is adjusting temperature based on user habits");
        }

        public void scheduleTemperature(int temperature, String time) {
            System.out.println("SmartThermostat is set to " + temperature + "°C at " + time);
        }
    }

