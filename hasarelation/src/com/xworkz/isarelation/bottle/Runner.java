package com.xworkz.isarelation.bottle;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Bottle");
        Bottle bottle = new Bottle();
        bottle.open();
        bottle.close();
        bottle.fill();
        bottle.empty();

        System.out.println("\nCreating an instance of WaterBottle using Bottle reference");
        Bottle bottleRef = new WaterBottle();
        bottleRef.open();
        bottleRef.close();
        bottleRef.fill();
        bottleRef.empty();

        System.out.println("\nCreating an instance of WaterBottle using subclass reference");
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.open();
        waterBottle.close();
        waterBottle.fill();
        waterBottle.empty();
        waterBottle.checkTemperature();
    }
}
