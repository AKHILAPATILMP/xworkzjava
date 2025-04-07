package com.xworkz.isarelation.bottle;

public class BottleStand {

    public void hold(Bottle bottle) {
        bottle.open();
        bottle.fill();
        bottle.empty();
        bottle.clean();
        bottle.close();

        if (bottle instanceof WaterBottle) {
            System.out.println("Casting: bottle is instance of WaterBottle");
            WaterBottle water = (WaterBottle) bottle;
            water.checkTemperature();
        }
    }
}
