package com.xworkz.isarelation.microwave;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartMicrowave using Microwave reference");
            Microwave microwaveRef = new SmartMicrowave();
            microwaveRef.powerOn();
            microwaveRef.heatFood();
            microwaveRef.setTimer();
            microwaveRef.stopHeating();
            microwaveRef.powerOff();

            System.out.println("\nCreating an instance of SmartMicrowave using subclass reference");
            SmartMicrowave smartMicrowave = new SmartMicrowave();
            smartMicrowave.powerOn();
            smartMicrowave.heatFood();
            smartMicrowave.setTimer();
            smartMicrowave.stopHeating();
            smartMicrowave.powerOff();
            smartMicrowave.connectToWiFi();
            smartMicrowave.voiceControl();
            smartMicrowave.autoCookMode();
            smartMicrowave.touchControl();
            smartMicrowave.energySavingMode();
        }
    }

