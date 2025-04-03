package com.xworkz.isarelation.ac;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartAC using AC reference");
            AC acRef = new SmartAC();
            acRef.turnOn();
            acRef.turnOff();
            acRef.setTemperature(24);
            acRef.enableCooling();
            acRef.enableHeating();

            System.out.println("\nCreating an instance of SmartAC using subclass reference");
            SmartAC smartAC = new SmartAC();
            smartAC.turnOn();
            smartAC.turnOff();
            smartAC.setTemperature(22);
            smartAC.enableCooling();
            smartAC.enableHeating();
            smartAC.connectToWiFi();
            smartAC.controlWithApp();
            smartAC.voiceControl();
            smartAC.energySavingMode();
            smartAC.autoAdjustTemperature();
        }
    }

