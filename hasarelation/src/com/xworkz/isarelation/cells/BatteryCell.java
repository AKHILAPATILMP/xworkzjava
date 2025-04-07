package com.xworkz.isarelation.cells;

public class BatteryCell extends Cells {

    public BatteryCell() {
        super();
        System.out.println("BatteryCell constructor is running - subclass");
    }

    @Override
    public void storeEnergy() {
        System.out.println("Storing energy using lithium-ion - subclass");
    }

    @Override
    public void dischargeEnergy() {
        System.out.println("Discharging energy steadily - subclass");
    }

    @Override
    public void checkVoltage() {
        System.out.println("Checking voltage with sensor - subclass");
    }

    @Override
    public void checkCapacity() {
        System.out.println("Checking capacity in mAh - subclass");
    }

    @Override
    public void recycle() {
        System.out.println("Recycling battery cells properly - subclass");
    }

    public void chargeCell() {
        System.out.println("Charging the battery cell - subclass only");
    }
}
