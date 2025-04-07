package com.xworkz.isarelation.bus;

public class BusDepot {

    public void operate(Bus bus) {
        bus.start();
        bus.accelerate();
        bus.checkFuel();
        bus.openDoor();
        bus.stop();

        if (bus instanceof ElectricBus) {
            System.out.println("Casting: Bus is instance of ElectricBus");
            ElectricBus electricBus = (ElectricBus) bus;
            electricBus.chargeBattery();
        }
    }
}
