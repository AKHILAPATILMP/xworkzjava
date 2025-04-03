package com.xworkz.isarelation.cooker;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartCooker using Cooker reference");
            Cooker cookerRef = new SmartCooker();
            cookerRef.powerOn();
            cookerRef.cookFood();
            cookerRef.setTimer();
            cookerRef.stopCooking();
            cookerRef.powerOff();

            System.out.println("\nCreating an instance of SmartCooker using subclass reference");
            SmartCooker smartCooker = new SmartCooker();
            smartCooker.powerOn();
            smartCooker.cookFood();
            smartCooker.setTimer();
            smartCooker.stopCooking();
            smartCooker.powerOff();
            smartCooker.connectToWiFi();
            smartCooker.voiceControl();
            smartCooker.autoCookingMode();
            smartCooker.touchControl();
            smartCooker.energySavingMode();
        }
    }

