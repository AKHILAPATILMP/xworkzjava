package com.xworkz.isarelation.bottle;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Bottle");
        Bottle bottle = new Bottle();
        bottle.open();
        bottle.fill();
        bottle.empty();
        bottle.clean();
        bottle.close();

        System.out.println("\nCreating instance of WaterBottle using Bottle reference");
        Bottle ref = new WaterBottle();
        ref.open();
        ref.fill();
        ref.empty();
        ref.clean();
        ref.close();

        System.out.println("\nCreating instance of WaterBottle using subclass reference");
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.open();
        waterBottle.fill();
        waterBottle.empty();
        waterBottle.clean();
        waterBottle.close();
        waterBottle.checkTemperature();

        System.out.println("\nRunning BottleStand:");
        BottleStand stand = new BottleStand();
        stand.hold(bottle);
        stand.hold(ref);
        stand.hold(waterBottle);
    }
}
