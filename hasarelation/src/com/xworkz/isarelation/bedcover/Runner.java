package com.xworkz.isarelation.bedcover;

public class Runner {

        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartBedCover using BedCover reference");
            BedCover bedCoverRef = new Bedcovercolor();
            bedCoverRef.spread();
            bedCoverRef.remove();
            bedCoverRef.wash();
            bedCoverRef.dry();
            bedCoverRef.fold();

            System.out.println("\nCreating an instance of SmartBedCover using subclass reference");
            Bedcovercolor smartBedCover = new Bedcovercolor();
            smartBedCover.spread();
            smartBedCover.remove();
            smartBedCover.wash();
            smartBedCover.dry();
            smartBedCover.fold();
            smartBedCover.temperatureControl();
            smartBedCover.autoClean();
            smartBedCover.antiAllergyProtection();
            smartBedCover.sleepTracking();
            smartBedCover.smartAppControl();
        }
    }

