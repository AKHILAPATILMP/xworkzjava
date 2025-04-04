package com.xworkz.isarelation.bed;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Bed");
        Bed bed = new Bed();
        bed.sleep();
        bed.adjustPillow();
        bed.makeBed();
        bed.cleanBed();

        System.out.println("\nCreating an instance of SmartBed using Bed reference");
        Bed bedRef = new SmartBed();
        bedRef.sleep();
        bedRef.adjustPillow();
        bedRef.makeBed();
        bedRef.cleanBed();

        System.out.println("\nCreating an instance of SmartBed using subclass reference");
        SmartBed smartBed = new SmartBed();
        smartBed.sleep();
        smartBed.adjustPillow();
        smartBed.makeBed();
        smartBed.cleanBed();
    }
}
