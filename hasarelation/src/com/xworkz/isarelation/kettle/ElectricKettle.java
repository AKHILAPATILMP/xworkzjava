package com.xworkz.isarelation.kettle;

public class ElectricKettle extends Kettle {

    public ElectricKettle() {
        super();
        System.out.println("ElectricKettle constructor is running - subclass");
    }

    @Override
    public void fillWater() {
        System.out.println("ElectricKettle filled with filtered water - subclass");
    }

    @Override
    public void heatWater() {
        System.out.println("ElectricKettle is heating water automatically - subclass");
    }

    @Override
    public void pourWater() {
        System.out.println("ElectricKettle pouring water with safety lid - subclass");
    }

    @Override
    public void cleanKettle() {
        System.out.println("ElectricKettle is self-cleaning - subclass");
    }
}
