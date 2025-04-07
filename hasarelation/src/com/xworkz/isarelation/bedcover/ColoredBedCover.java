package com.xworkz.isarelation.bedcover;

public class ColoredBedCover extends BedCover {

    public ColoredBedCover() {
        super();
        System.out.println("ColoredBedCover constructor is running - subclass");
    }

    @Override
    public void spread() {
        System.out.println("Spreading a colorful bedcover - subclass");
    }

    @Override
    public void fold() {
        System.out.println("Folding the colored bedcover - subclass");
    }

    @Override
    public void wash() {
        System.out.println("Washing with color-protect detergent - subclass");
    }

    @Override
    public void dry() {
        System.out.println("Drying in the shade to retain color - subclass");
    }

    @Override
    public void iron() {
        System.out.println("Ironing carefully to avoid fading - subclass");
    }

    public void matchRoomTheme() {
        System.out.println("Matching the bedcover with the room theme - subclass");
    }
}
