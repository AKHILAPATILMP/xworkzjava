package com.xworkz.isarelation.bottle;


    public class SmartBottle extends Bottle {
        public SmartBottle() {
            super();
            System.out.println("SmartBottle constructor is running");
        }

        public void showTemperature() {
            System.out.println("SmartBottle is displaying the liquid temperature");
        }

        public void remindToDrink() {
            System.out.println("SmartBottle is reminding the user to drink water");
        }

        public void trackWaterIntake() {
            System.out.println("SmartBottle is tracking daily water intake");
        }

        public void connectToApp() {
            System.out.println("SmartBottle is connecting to a smartphone app");
        }

        public void autoPurify() {
            System.out.println("SmartBottle is purifying the water automatically");
        }
    }

