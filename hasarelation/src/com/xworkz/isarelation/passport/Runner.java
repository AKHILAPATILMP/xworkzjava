package com.xworkz.isarelation.passport;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Passport");
            Passport passport = new Passport();
            passport.verifyIdentity();
            passport.authorizeTravel();
            passport.storePersonalData();
            passport.proveCitizenship();
            passport.issueVisaStamps();

            System.out.println("\nCreating an instance of EPassport using Passport reference");
            Passport passportRef = new EPassport();
            passportRef.verifyIdentity();
            passportRef.authorizeTravel();
            passportRef.storePersonalData();
            passportRef.proveCitizenship();
            passportRef.issueVisaStamps();

            System.out.println("\nCreating an instance of EPassport using subclass reference");
            EPassport ePassport = new EPassport();
            ePassport.verifyIdentity();
            ePassport.authorizeTravel();
            ePassport.storePersonalData();
            ePassport.proveCitizenship();
            ePassport.issueVisaStamps();
            ePassport.embeddedChip();
            ePassport.biometricAuthentication();
            ePassport.digitalVerification();
            ePassport.contactlessScanning();
            ePassport.enhancedSecurity();
        }
    }

