package com.xworkz.isarelation.photocopy;
    public class SmartPhotocopy extends Photocopy {
        public SmartPhotocopy() {
            super();
            System.out.println("SmartPhotocopy constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartPhotocopier is connecting to WiFi");
        }

        public void cloudPrinting() {
            System.out.println("SmartPhotocopier is printing from cloud storage");
        }

        public void autoDuplexMode() {
            System.out.println("SmartPhotocopier is printing on both sides automatically");
        }

        public void touchControl() {
            System.out.println("SmartPhotocopier is using touch controls");
        }

        public void energySavingMode() {
            System.out.println("SmartPhotocopier is in energy-saving mode");
        }
    }

