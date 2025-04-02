package com.xworkz.isarelation.park;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Park");
            Park park = new Park();
            park.provideWalkingTrack();
            park.offerGreenery();
            park.provideBenches();
            park.supportOutdoorGames();
            park.ensureCleanliness();

            System.out.println("\nCreating an instance of ThemePark using Park reference");
            Park parkRef = new ThemePark();
            parkRef.provideWalkingTrack();
            parkRef.offerGreenery();
            parkRef.provideBenches();
            parkRef.supportOutdoorGames();
            parkRef.ensureCleanliness();

            System.out.println("\nCreating an instance of ThemePark using subclass reference");
            ThemePark themePark = new ThemePark();
            themePark.provideWalkingTrack();
            themePark.offerGreenery();
            themePark.provideBenches();
            themePark.supportOutdoorGames();
            themePark.ensureCleanliness();
            themePark.offerRollerCoaster();
            themePark.provideWaterSlides();
            themePark.organizeLiveShows();
            themePark.offerFoodStalls();
            themePark.provideVirtualRealityGames();
        }
    }


