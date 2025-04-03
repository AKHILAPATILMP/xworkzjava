package com.xworkz.isarelation.toaster;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartToaster using Toaster reference");
            Toaster toasterRef = new SmartToaster();
            toasterRef.powerOn();
            toasterRef.toastBread();
            toasterRef.setTimer();
            toasterRef.stopToasting();
            toasterRef.powerOff();

            System.out.println("\nCreating an instance of SmartToaster using subclass reference");
            SmartToaster smartToaster = new SmartToaster();
            smartToaster.powerOn();
            smartToaster.toastBread();
            smartToaster.setTimer();
            smartToaster.stopToasting();
            smartToaster.powerOff();
            smartToaster.connectToWiFi();
            smartToaster.voiceControl();
            smartToaster.adjustBrowningLevel();
            smartToaster.touchControl();
            smartToaster.energySavingMode();
        }
    }

