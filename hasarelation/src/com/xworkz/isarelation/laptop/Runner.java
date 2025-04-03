package com.xworkz.isarelation.laptop;

public class Runner {

        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartLaptop using Laptop reference");
            Laptop laptopRef = new SmartLaptop();
            laptopRef.powerOn();
            laptopRef.runApplication();
            laptopRef.connectToWiFi();
            laptopRef.chargeBattery();
            laptopRef.powerOff();

            System.out.println("\nCreating an instance of SmartLaptop using subclass reference");
            SmartLaptop smartLaptop = new SmartLaptop();
            smartLaptop.powerOn();
            smartLaptop.runApplication();
            smartLaptop.connectToWiFi();
            smartLaptop.chargeBattery();
            smartLaptop.powerOff();
            smartLaptop.voiceAssistant();
            smartLaptop.fingerprintUnlock();
            smartLaptop.touchscreenMode();
            smartLaptop.faceRecognition();
            smartLaptop.fastCharging();
        }
    }

