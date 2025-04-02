package com.xworkz.isarelation.beach;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Beach");
            Beach beach = new Beach();
            beach.relax();
            beach.swim();
            beach.playVolleyball();
            beach.sunbathe();
            beach.watchSunset();

            System.out.println("\nCreating an instance of ResortBeach using Beach reference");
            Beach beachRef = new ResortBeach();
            beachRef.relax();
            beachRef.swim();
            beachRef.playVolleyball();
            beachRef.sunbathe();
            beachRef.watchSunset();

            System.out.println("\nCreating an instance of ResortBeach using subclass reference");
            ResortBeach resortBeach = new ResortBeach();
            resortBeach.relax();
            resortBeach.swim();
            resortBeach.playVolleyball();
            resortBeach.sunbathe();
            resortBeach.watchSunset();
            resortBeach.serveDrinks();
            resortBeach.provideSunbeds();
            resortBeach.organizeWaterSports();
            resortBeach.offerLuxuryCabanas();
            resortBeach.hostBeachParties();
        }
    }


