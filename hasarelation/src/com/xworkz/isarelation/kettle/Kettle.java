package com.xworkz.isarelation.kettle;

public class Kettle {

    public Kettle() {
        System.out.println("Kettle constructor is running - parent class");
    }

    public void boilWater() {
        System.out.println("Boiling water - parent class");
    }

    public void pourWater() {
        System.out.println("Pouring water - parent class");
    }

    public void cleanKettle() {
        System.out.println("Cleaning kettle - parent class");
    }

    public void checkWaterLevel() {
        System.out.println("Checking water level - parent class");
    }

    public void handleLid() {
        System.out.println("Handling kettle lid - parent class");
    }
}
