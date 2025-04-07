package com.xworkz.isarelation.bed;

public class BedManager {

    public void manage(Bed bed) {
        bed.sleep();
        bed.makeBed();
        bed.clean();
        bed.adjustPosition();
        bed.storeUnderbedItems();

        if (bed instanceof SmartBed) {
            System.out.println("Casting: bed is instance of SmartBed");
            SmartBed smartBed = (SmartBed) bed;
            smartBed.trackSleepPatterns();
        }
    }
}
