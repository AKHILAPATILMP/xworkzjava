package com.xworkz.isarelation.kettle;

public class ElectricKettle extends Kettle {

    public ElectricKettle() {
        super();
        System.out.println("ElectricKettle constructor is running - subclass");
    }

    @Override
    public void boilWater() {
        System.out.println("ElectricKettle boiling water automatically - subclass");
    }

    @Override
    public void pourWater() {
        System.out.println("ElectricKettle pouring water through spout - subclass");
    }

    @Override
    public void cleanKettle() {
        System.out.println("ElectricKettle self-cleaning enabled - subclass");
    }

    @Override
    public void checkWaterLevel() {
        System.out.println("ElectricKettle checking water level with sensor - subclass");
    }

    @Override
    public void handleLid() {
        System.out.println("ElectricKettle lid opens with button - subclass");
    }

    public void autoShutdown() {
        System.out.println("ElectricKettle auto shuts off when water boils - subclass method");
    }
}
