package com.xworkz.isarelation.beach;

public class BeachManager {
    public void manage(Beach beach) {
        beach.relax();
        beach.swim();
        beach.walk();
        beach.cleanBeach();
        beach.playVolleyball();

        if (beach instanceof ResortBeach) {
            System.out.println("Casting: Beach is instance of ResortBeach");
            ResortBeach resortBeach = (ResortBeach) beach;
            resortBeach.enjoyResortFacilities();
        }
    }
}
