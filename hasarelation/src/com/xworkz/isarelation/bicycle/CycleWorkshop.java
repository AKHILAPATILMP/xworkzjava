package com.xworkz.isarelation.bicycle;

public class CycleWorkshop {
    public void service(Bicycle bicycle) {
        bicycle.ride();
        bicycle.brake();
        bicycle.ringBell();
        bicycle.adjustSeat();
        bicycle.inflateTyres();

        if (bicycle instanceof MountainBike) {
            System.out.println("Casting: bicycle is instance of MountainBike");
            MountainBike mtb = (MountainBike) bicycle;
            mtb.changeGears();
        }
    }
}
