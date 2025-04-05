package com.xworkz.isarelation.park;

public class ThemePark extends Park {

    public ThemePark() {
        super();
        System.out.println("ThemePark constructor is running - subclass");
    }

    @Override
    public void open() {
        System.out.println("ThemePark opens with exciting rides - subclass");
    }

    @Override
    public void close() {
        System.out.println("ThemePark closes after fireworks - subclass");
    }

    @Override
    public void maintain() {
        System.out.println("ThemePark rides and areas are being maintained - subclass");
    }

    @Override
    public void provideSeating() {
        System.out.println("ThemePark provides themed seating areas - subclass");
    }
}


