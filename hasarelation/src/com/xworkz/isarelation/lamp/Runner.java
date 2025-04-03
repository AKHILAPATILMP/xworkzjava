package com.xworkz.isarelation.lamp;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartLamp using Lamp reference");
            Lamp lampRef = new SmartLamp();
            lampRef.turnOn();
            lampRef.turnOff();
            lampRef.adjustBrightness();
            lampRef.changeBulb();
            lampRef.decorate();

            System.out.println("\nCreating an instance of SmartLamp using subclass reference");
            SmartLamp smartLamp = new SmartLamp();
            smartLamp.turnOn();
            smartLamp.turnOff();
            smartLamp.adjustBrightness();
            smartLamp.changeBulb();
            smartLamp.decorate();
            smartLamp.connectToWiFi();
            smartLamp.changeColor();
            smartLamp.voiceControl();
            smartLamp.scheduleLighting();
            smartLamp.energySavingMode();
        }
    }

