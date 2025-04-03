package com.xworkz.isarelation.bottle;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartBottle using Bottle reference");
            Bottle bottleRef = new SmartBottle();
            bottleRef.fill();
            bottleRef.pour();
            bottleRef.openCap();
            bottleRef.closeCap();
            bottleRef.clean();

            System.out.println("\nCreating an instance of SmartBottle using subclass reference");
            SmartBottle smartBottle = new SmartBottle();
            smartBottle.fill();
            smartBottle.pour();
            smartBottle.openCap();
            smartBottle.closeCap();
            smartBottle.clean();
            smartBottle.showTemperature();
            smartBottle.remindToDrink();
            smartBottle.trackWaterIntake();
            smartBottle.connectToApp();
            smartBottle.autoPurify();
        }
    }

