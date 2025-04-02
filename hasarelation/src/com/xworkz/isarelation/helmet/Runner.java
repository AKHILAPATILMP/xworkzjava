package com.xworkz.isarelation.helmet;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Helmet");
            Helmet helmet = new Helmet();
            helmet.protectHead();
            helmet.absorbImpact();
            helmet.provideComfort();
            helmet.reduceNoise();
            helmet.ensureVisibility();

            System.out.println("\nCreating an instance of SmartHelmet using Helmet reference");
            Helmet helmetRef = new SmartHelmet();
            helmetRef.protectHead();
            helmetRef.absorbImpact();
            helmetRef.provideComfort();
            helmetRef.reduceNoise();
            helmetRef.ensureVisibility();

            System.out.println("\nCreating an instance of SmartHelmet using subclass reference");
            SmartHelmet smartHelmet = new SmartHelmet();
            smartHelmet.protectHead();
            smartHelmet.absorbImpact();
            smartHelmet.provideComfort();
            smartHelmet.reduceNoise();
            smartHelmet.ensureVisibility();
            smartHelmet.bluetoothConnectivity();
            smartHelmet.gpsNavigation();
            smartHelmet.voiceControl();
            smartHelmet.emergencyAlert();
            smartHelmet.rearViewCamera();
        }
    }

