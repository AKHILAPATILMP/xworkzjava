package com.xworkz.isarelation.coffeemaker;

    public class SmartCoffeemaker extends Coffeemaker {
        public SmartCoffeemaker() {
            super();
            System.out.println("SmartCoffeemaker constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartCoffeemaker is connecting to WiFi");
        }

        public void voiceControl() {
            System.out.println("SmartCoffeemaker is responding to voice commands");
        }

        public void autoBrewMode() {
            System.out.println("SmartCoffeemaker is in auto-brew mode");
        }

        public void touchControl() {
            System.out.println("SmartCoffeemaker is using touch controls");
        }

        public void energySavingMode() {
            System.out.println("SmartCoffeemaker is in energy-saving mode");
        }
    }

