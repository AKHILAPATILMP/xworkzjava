package com.xworkz.isarelation.photocopy;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartPhotocopy using Photocopy reference");
            Photocopy photocopyRef = new SmartPhotocopy();
            photocopyRef.powerOn();
            photocopyRef.scanDocument();
            photocopyRef.printCopy();
            photocopyRef.stopCopying();
            photocopyRef.powerOff();

            System.out.println("\nCreating an instance of SmartPhotocopy using subclass reference");
            SmartPhotocopy smartPhotocopy = new SmartPhotocopy();
            smartPhotocopy.powerOn();
            smartPhotocopy.scanDocument();
            smartPhotocopy.printCopy();
            smartPhotocopy.stopCopying();
            smartPhotocopy.powerOff();
            smartPhotocopy.connectToWiFi();
            smartPhotocopy.cloudPrinting();
            smartPhotocopy.autoDuplexMode();
            smartPhotocopy.touchControl();
            smartPhotocopy.energySavingMode();
        }
    }

