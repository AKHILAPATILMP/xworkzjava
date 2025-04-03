package com.xworkz.isarelation.desk;

    public class SmartDesk extends Desk {
        public SmartDesk() {
            super();
            System.out.println("SmartDesk constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartDesk is connecting to WiFi");
        }

        public void adjustHeightAutomatically() {
            System.out.println("SmartDesk is adjusting height automatically");
        }

        public void wirelessCharging() {
            System.out.println("SmartDesk is wirelessly charging devices");
        }

        public void touchControl() {
            System.out.println("SmartDesk is using touch controls");
        }

        public void energySavingMode() {
            System.out.println("SmartDesk is in energy-saving mode");
        }
    }

