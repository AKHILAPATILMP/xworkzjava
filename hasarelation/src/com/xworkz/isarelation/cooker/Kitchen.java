package com.xworkz.isarelation.cooker;

public class Kitchen {
    public void operate(Cooker cooker) {
        cooker.addIngredients();
        cooker.addWater();
        cooker.startCooking();
        cooker.stopCooking();
        cooker.cleanCooker();

        if (cooker instanceof SmartCooker) {
            System.out.println("Casting: Cooker is a SmartCooker");
            SmartCooker smart = (SmartCooker) cooker;
            smart.scheduleCooking();
        }
    }
}
