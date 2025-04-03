package com.xworkz.isarelation.coffeemaker;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartCoffeemaker using Coffeemaker reference");
            Coffeemaker coffeemakerRef = new SmartCoffeemaker();
            coffeemakerRef.powerOn();
            coffeemakerRef.brewCoffee();
            coffeemakerRef.setTimer();
            coffeemakerRef.stopBrewing();
            coffeemakerRef.powerOff();

            System.out.println("\nCreating an instance of SmartCoffeemaker using subclass reference");
            SmartCoffeemaker smartCoffeemaker = new SmartCoffeemaker();
            smartCoffeemaker.powerOn();
            smartCoffeemaker.brewCoffee();
            smartCoffeemaker.setTimer();
            smartCoffeemaker.stopBrewing();
            smartCoffeemaker.powerOff();
            smartCoffeemaker.connectToWiFi();
            smartCoffeemaker.voiceControl();
            smartCoffeemaker.autoBrewMode();
            smartCoffeemaker.touchControl();
            smartCoffeemaker.energySavingMode();
        }
    }

