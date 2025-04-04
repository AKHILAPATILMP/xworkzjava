package com.xworkz.isarelation.bus;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Bus");
        Bus bus = new Bus();
        bus.start();
        bus.stop();
        bus.accelerate();
        bus.openDoors();

        System.out.println("\nCreating an instance of LuxuryBus using Bus reference");
        Bus busRef = new LuxuryBus();
        busRef.start();
        busRef.stop();
        busRef.accelerate();
        busRef.openDoors();

        System.out.println("\nCreating an instance of LuxuryBus using subclass reference");
        LuxuryBus luxuryBus = new LuxuryBus();
        luxuryBus.start();
        luxuryBus.stop();
        luxuryBus.accelerate();
        luxuryBus.openDoors();
        luxuryBus.enableAC();
        luxuryBus.provideEntertainment();
    }
}
