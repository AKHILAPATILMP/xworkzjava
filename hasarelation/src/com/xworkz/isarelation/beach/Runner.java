package com.xworkz.isarelation.beach;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Beach");
        Beach beach = new Beach();
        beach.relax();
        beach.swim();
        beach.walk();
        beach.cleanBeach();
        beach.playVolleyball();

        System.out.println("\nCreating instance of ResortBeach using Beach reference");
        Beach beachRef = new ResortBeach();
        beachRef.relax();
        beachRef.swim();
        beachRef.walk();
        beachRef.cleanBeach();
        beachRef.playVolleyball();

        System.out.println("\nCreating instance of ResortBeach using subclass reference");
        ResortBeach resortBeach = new ResortBeach();
        resortBeach.relax();
        resortBeach.swim();
        resortBeach.walk();
        resortBeach.cleanBeach();
        resortBeach.playVolleyball();
        resortBeach.enjoyResortFacilities();

        System.out.println("\nCasting in BeachManager");
        BeachManager manager = new BeachManager();
        manager.manage(beach);
        manager.manage(beachRef);
        manager.manage(resortBeach);
    }
}
