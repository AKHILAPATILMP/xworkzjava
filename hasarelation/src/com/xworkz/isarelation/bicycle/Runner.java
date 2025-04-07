package com.xworkz.isarelation.bicycle;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Bicycle");
        Bicycle cycle = new Bicycle();
        cycle.ride();
        cycle.brake();
        cycle.ringBell();
        cycle.adjustSeat();
        cycle.inflateTyres();

        System.out.println("\nCreating instance of MountainBike using Bicycle reference");
        Bicycle cycleRef = new MountainBike();
        cycleRef.ride();
        cycleRef.brake();
        cycleRef.ringBell();
        cycleRef.adjustSeat();
        cycleRef.inflateTyres();

        System.out.println("\nCreating instance of MountainBike using subclass reference");
        MountainBike mtb = new MountainBike();
        mtb.ride();
        mtb.brake();
        mtb.ringBell();
        mtb.adjustSeat();
        mtb.inflateTyres();
        mtb.changeGears();

        System.out.println("\nCalling CycleWorkshop service");
        CycleWorkshop workshop = new CycleWorkshop();
        workshop.service(cycle);
        workshop.service(cycleRef);
        workshop.service(mtb);
    }
}
