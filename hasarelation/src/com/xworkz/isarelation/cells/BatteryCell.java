package com.xworkz.isarelation.cells;

public class BatteryCell extends Cell {

    public BatteryCell() {
        super();
        System.out.println("BatteryCell constructor is running - subclass");
    }

    @Override
    public void provideEnergy() {
        System.out.println("BatteryCell provides stable energy for devices - subclass");
    }

    @Override
    public void checkCharge() {
        System.out.println("BatteryCell charge level is displayed digitally - subclass");
    }

    @Override
    public void storeEnergy() {
        System.out.println("BatteryCell stores high-capacity energy - subclass");
    }

    @Override
    public void dispose() {
        System.out.println("BatteryCell is recycled in eco-friendly way - subclass");
    }
}
