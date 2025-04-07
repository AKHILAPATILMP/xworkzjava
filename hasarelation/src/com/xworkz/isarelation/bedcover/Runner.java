package com.xworkz.isarelation.bedcover;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of BedCover");
        BedCover bed = new BedCover();
        bed.spread();
        bed.fold();
        bed.wash();
        bed.dry();
        bed.iron();

        System.out.println("\nCreating an instance of ColoredBedCover using BedCover reference");
        BedCover bedRef = new ColoredBedCover();
        bedRef.spread();
        bedRef.fold();
        bedRef.wash();
        bedRef.dry();
        bedRef.iron();

        System.out.println("\nCreating an instance of ColoredBedCover using subclass reference");
        ColoredBedCover colored = new ColoredBedCover();
        colored.spread();
        colored.fold();
        colored.wash();
        colored.dry();
        colored.iron();
        colored.matchRoomTheme();

        System.out.println("\nCasting and method call in control class");
        BedCoverManager manager = new BedCoverManager();
        manager.manage(bed);      // parent
        manager.manage(bedRef);   // ref to subclass
        manager.manage(colored);  // subclass
    }
}
