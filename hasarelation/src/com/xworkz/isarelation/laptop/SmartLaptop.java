package com.xworkz.isarelation.laptop;
    public class SmartLaptop extends Laptop {
        public SmartLaptop() {
            super();
            System.out.println("SmartLaptop constructor is running");
        }

        public void voiceAssistant() {
            System.out.println("SmartLaptop is responding to voice commands");
        }

        public void fingerprintUnlock() {
            System.out.println("SmartLaptop is using fingerprint authentication");
        }

        public void touchscreenMode() {
            System.out.println("SmartLaptop is in touchscreen mode");
        }

        public void faceRecognition() {
            System.out.println("SmartLaptop is using face recognition for login");
        }

        public void fastCharging() {
            System.out.println("SmartLaptop supports fast charging");
        }
    }

