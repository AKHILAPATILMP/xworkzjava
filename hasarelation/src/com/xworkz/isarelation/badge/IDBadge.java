package com.xworkz.isarelation.badge;
    public class IDBadge extends Badge {
        public IDBadge() {
            super();
            System.out.println("IDBadge constructor is running");
        }

        public void scanQRCode() {
            System.out.println("IDBadge: Scanning QR code");
        }

        public void enableRFID() {
            System.out.println("IDBadge: Enabling RFID chip");
        }

        public void grantBuildingAccess() {
            System.out.println("IDBadge: Granting access to restricted areas");
        }

        public void trackEmployee() {
            System.out.println("IDBadge: Tracking employee movement");
        }

        public void storeDigitalSignature() {
            System.out.println("IDBadge: Storing digital signature");
        }
    }

