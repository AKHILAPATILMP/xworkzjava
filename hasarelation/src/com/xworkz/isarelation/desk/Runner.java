package com.xworkz.isarelation.desk;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartDesk using Desk reference");
            Desk deskRef = new SmartDesk();
            deskRef.placeItems();
            deskRef.organize();
            deskRef.clean();
            deskRef.adjustHeight();
            deskRef.fold();

            System.out.println("\nCreating an instance of SmartDesk using subclass reference");
            SmartDesk smartDesk = new SmartDesk();
            smartDesk.placeItems();
            smartDesk.organize();
            smartDesk.clean();
            smartDesk.adjustHeight();
            smartDesk.fold();
            smartDesk.connectToWiFi();
            smartDesk.adjustHeightAutomatically();
            smartDesk.wirelessCharging();
            smartDesk.touchControl();
            smartDesk.energySavingMode();
        }
    }

