package com.xworkz.isarelation.bulb;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartBulb using Bulb reference");
            Bulb bulbRef = new SmartBulb();
            bulbRef.turnOn();
            bulbRef.turnOff();
            bulbRef.glow();
            bulbRef.dim();
            bulbRef.flicker();

            System.out.println("\nCreating an instance of SmartBulb using subclass reference");
            SmartBulb smartBulb = new SmartBulb();
            smartBulb.turnOn();
            smartBulb.turnOff();
            smartBulb.glow();
            smartBulb.dim();
            smartBulb.flicker();
            smartBulb.changeColor();
            smartBulb.connectToWiFi();
            smartBulb.voiceControl();
            smartBulb.scheduleTimer();
            smartBulb.adjustBrightness();
        }
    }

