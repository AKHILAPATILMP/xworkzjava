package com.xworkz.isarelation.badge;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Badge");
            Badge badge = new Badge();
            badge.displayInfo();
            badge.authorizeAccess();
            badge.identifyPerson();
            badge.verifyAuthenticity();
            badge.wearBadge();

            System.out.println("\nCreating an instance of IDBadge using Badge reference");
            Badge badgeRef = new IDBadge();
            badgeRef.displayInfo();
            badgeRef.authorizeAccess();
            badgeRef.identifyPerson();
            badgeRef.verifyAuthenticity();
            badgeRef.wearBadge();

            System.out.println("\nCreating an instance of IDBadge using subclass reference");
            IDBadge idBadge = new IDBadge();
            idBadge.displayInfo();
            idBadge.authorizeAccess();
            idBadge.identifyPerson();
            idBadge.verifyAuthenticity();
            idBadge.wearBadge();
            idBadge.scanQRCode();
            idBadge.enableRFID();
            idBadge.grantBuildingAccess();
            idBadge.trackEmployee();
            idBadge.storeDigitalSignature();
        }
    }

