package com.xworkz.isarelation.tent;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartTent using Tent reference");
            Tent tentRef = new SmartTent();
            tentRef.setUp();
            tentRef.enter();
            tentRef.closeFlap();
            tentRef.provideShade();
            tentRef.packUp();

            System.out.println("\nCreating an instance of SmartTent using subclass reference");
            SmartTent smartTent = new SmartTent();
            smartTent.setUp();
            smartTent.enter();
            smartTent.closeFlap();
            smartTent.provideShade();
            smartTent.packUp();
            smartTent.adjustTemperature();
            smartTent.solarPower();
            smartTent.autoSetup();
            smartTent.enableLEDLighting();
            smartTent.connectToApp();
        }
    }

