package com.xworkz.isarelation.fan;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartFan using Fan reference");
            Fan fanRef = new SmartFan();
            fanRef.turnOn();
            fanRef.turnOff();
            fanRef.adjustSpeed();
            fanRef.oscillate();
            fanRef.stopOscillation();

            System.out.println("\nCreating an instance of SmartFan using subclass reference");
            SmartFan smartFan = new SmartFan();
            smartFan.turnOn();
            smartFan.turnOff();
            smartFan.adjustSpeed();
            smartFan.oscillate();
            smartFan.stopOscillation();
            smartFan.connectToWiFi();
            smartFan.controlWithApp();
            smartFan.voiceControl();
            smartFan.energySavingMode();
            smartFan.scheduleTimer();
        }
    }

