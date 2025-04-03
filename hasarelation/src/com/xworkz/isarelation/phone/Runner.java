package com.xworkz.isarelation.phone;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartPhone using Phone reference");
            Phone phoneRef = new SmartPhone();
            phoneRef.makeCall();
            phoneRef.receiveCall();
            phoneRef.sendMessage();
            phoneRef.receiveMessage();
            phoneRef.chargeBattery();

            System.out.println("\nCreating an instance of SmartPhone using subclass reference");
            SmartPhone smartPhone = new SmartPhone();
            smartPhone.makeCall();
            smartPhone.receiveCall();
            smartPhone.sendMessage();
            smartPhone.receiveMessage();
            smartPhone.chargeBattery();
            smartPhone.browseInternet();
            smartPhone.takePhoto();
            smartPhone.playMusic();
            smartPhone.useFingerprintUnlock();
            smartPhone.useFaceRecognition();
        }
    }

