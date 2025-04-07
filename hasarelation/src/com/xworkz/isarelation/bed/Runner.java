package com.xworkz.isarelation.bed;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Bed");
        Bed bed = new Bed();
        bed.sleep();
        bed.makeBed();
        bed.clean();
        bed.adjustPosition();
        bed.storeUnderbedItems();

        System.out.println("\nCreating instance of SmartBed using Bed reference");
        Bed smartBedRef = new SmartBed();
        smartBedRef.sleep();
        smartBedRef.makeBed();
        smartBedRef.clean();
        smartBedRef.adjustPosition();
        smartBedRef.storeUnderbedItems();

        System.out.println("\nCreating instance of SmartBed using subclass reference");
        SmartBed smartBed = new SmartBed();
        smartBed.sleep();
        smartBed.makeBed();
        smartBed.clean();
        smartBed.adjustPosition();
        smartBed.storeUnderbedItems();
        smartBed.trackSleepPatterns();

        System.out.println("\nCalling BedManager to handle casting");
        BedManager manager = new BedManager();
        manager.manage(bed);
        manager.manage(smartBedRef);
        manager.manage(smartBed);
    }
}
