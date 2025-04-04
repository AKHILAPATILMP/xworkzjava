package com.xworkz.isarelation.fridge;

public class DoubleDoorFridge extends Fridge {

    public DoubleDoorFridge() {
        super();
        System.out.println("DoubleDoorFridge constructor is running - subclass");
    }

    @Override
    public void cool() {
        System.out.println("DoubleDoorFridge provides faster cooling - subclass");
    }

    @Override
    public void defrost() {
        System.out.println("DoubleDoorFridge uses auto-defrost system - subclass");
    }

    @Override
    public void storeItems() {
        System.out.println("DoubleDoorFridge stores large quantities of items - subclass");
    }

    @Override
    public void showTemperature() {
        System.out.println("DoubleDoorFridge displays digital temperature - subclass");
    }
}



