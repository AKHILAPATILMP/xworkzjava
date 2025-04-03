package com.xworkz.isarelation.vacuumCleaner;
    public class SmartCleaner extends VacuumCleaner {
        public SmartCleaner() {
            super();
            System.out.println("SmartVacuumCleaner constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("Smart Vacuum Cleaner is connecting to WiFi");
        }

        public void controlWithApp() {
            System.out.println("Smart Vacuum Cleaner is being controlled via mobile app");
        }

        public void voiceControl() {
            System.out.println("Smart Vacuum Cleaner is responding to voice commands");
        }

        public void autoCleanMode() {
            System.out.println("Smart Vacuum Cleaner is cleaning automatically");
        }

        public void returnToDock() {
            System.out.println("Smart Vacuum Cleaner is returning to the charging dock");
        }
    }

