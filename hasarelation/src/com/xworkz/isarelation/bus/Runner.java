package com.xworkz.isarelation.bus;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Bus");
        Bus bus = new Bus();
        bus.start();
        bus.accelerate();
        bus.checkFuel();
        bus.openDoor();
        bus.stop();

        System.out.println("\nCreating instance of ElectricBus using Bus reference");
        Bus busRef = new ElectricBus();
        busRef.start();
        busRef.accelerate();
        busRef.checkFuel();
        busRef.openDoor();
        busRef.stop();

        System.out.println("\nCreating instance of ElectricBus using subclass reference");
        ElectricBus electric = new ElectricBus();
        electric.start();
        electric.accelerate();
        electric.checkFuel();
        electric.openDoor();
        electric.stop();
        electric.chargeBattery();

        System.out.println("\nOperating through BusDepot (controller)");
        BusDepot depot = new BusDepot();
        depot.operate(bus);
        depot.operate(busRef);
        depot.operate(electric);
    }
}
