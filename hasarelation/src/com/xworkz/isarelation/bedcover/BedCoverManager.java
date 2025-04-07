package com.xworkz.isarelation.bedcover;

public class BedCoverManager {
    public void manage(BedCover bedcover) {
        bedcover.spread();
        bedcover.fold();
        bedcover.wash();
        bedcover.dry();
        bedcover.iron();

        if (bedcover instanceof ColoredBedCover) {
            System.out.println("Casting: bedcover is instance of ColoredBedCover");
            ColoredBedCover colored = (ColoredBedCover) bedcover;
            colored.matchRoomTheme();
        }
    }
}
