package com.xworkz.isarelation.passport;
    public class EPassport extends Passport {
        public EPassport() {
            super();
            System.out.println("EPassport constructor is running");
        }

        public void embeddedChip() {
            System.out.println("EPassport: Containing an embedded microchip...");
        }

        public void biometricAuthentication() {
            System.out.println("EPassport: Supporting biometric authentication...");
        }

        public void digitalVerification() {
            System.out.println("EPassport: Enabling digital verification...");
        }

        public void contactlessScanning() {
            System.out.println("EPassport: Allowing contactless scanning...");
        }

        public void enhancedSecurity() {
            System.out.println("EPassport: Providing enhanced security features...");
        }
    }

