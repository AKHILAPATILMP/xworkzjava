package com.xworkz.isarelation.phone;

    public class SmartPhone extends Phone {
        public SmartPhone() {
            super();
            System.out.println("SmartPhone constructor is running");
        }

        public void browseInternet() {
            System.out.println("SmartPhone is browsing the internet");
        }

        public void takePhoto() {
            System.out.println("SmartPhone is taking a photo");
        }

        public void playMusic() {
            System.out.println("SmartPhone is playing music");
        }

        public void useFingerprintUnlock() {
            System.out.println("SmartPhone is unlocking with fingerprint");
        }

        public void useFaceRecognition() {
            System.out.println("SmartPhone is using face recognition");
        }
    }

