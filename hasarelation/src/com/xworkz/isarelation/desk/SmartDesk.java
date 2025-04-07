package com.xworkz.isarelation.desk;

public class SmartDesk extends Desk {

    public SmartDesk() {
        super();
        System.out.println("SmartDesk constructor is running - subclass");
    }

    @Override
    public void supportItems() {
        System.out.println("SmartDesk supports gadgets and wireless chargers - subclass");
    }

    @Override
    public void provideSurface() {
        System.out.println("SmartDesk provides touchscreen surface - subclass");
    }

    @Override
    public void storeItems() {
        System.out.println("SmartDesk stores digitally secured items - subclass");
    }

    @Override
    public void adjustHeight() {
        System.out.println("SmartDesk adjusts height electronically - subclass");
    }

    @Override
    public void cleanSurface() {
        System.out.println("SmartDesk auto-cleans with UV - subclass");
    }

    public void connectBluetooth() {
        System.out.println("SmartDesk connecting to Bluetooth speaker - subclass specific");
    }
}
