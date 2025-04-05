package com.xworkz.isarelation.vacuumCleaner;
public class VacuumCleaner {

    public VacuumCleaner() {
        System.out.println("VacuumCleaner constructor is running - parent class");
    }

    public void start() {
        System.out.println("VacuumCleaner started - parent class");
    }

    public void stop() {
        System.out.println("VacuumCleaner stopped - parent class");
    }

    public void cleanFloor() {
        System.out.println("Cleaning the floor - parent class");
    }

    public void emptyDustBag() {
        System.out.println("Emptying the dust bag - parent class");
    }
}


