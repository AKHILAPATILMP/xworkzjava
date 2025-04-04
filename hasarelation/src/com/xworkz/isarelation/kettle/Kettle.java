package com.xworkz.isarelation.kettle;
public class Kettle {

    public Kettle() {
        System.out.println("Kettle constructor is running - parent class");
    }

    public void fillWater() {
        System.out.println("Filling water in the kettle - parent class");
    }

    public void heatWater() {
        System.out.println("Heating water in the kettle - parent class");
    }

    public void pourWater() {
        System.out.println("Pouring hot water - parent class");
    }

    public void cleanKettle() {
        System.out.println("Cleaning the kettle - parent class");
    }
}

