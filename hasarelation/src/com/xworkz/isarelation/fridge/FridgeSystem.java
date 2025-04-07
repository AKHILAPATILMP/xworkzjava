package com.xworkz.isarelation.fridge;

public class FridgeSystem {
    public void operate(Fridge fridge) {
        fridge.coolItems();
        fridge.freeze();
        fridge.storeFood();
        fridge.defrost();
        fridge.turnOn();

        if (fridge instanceof SmartFridge) {
            System.out.println("Casting: fridge is an instance of SmartFridge");
            SmartFridge smart = (SmartFridge) fridge;
            smart.connectWifi();
        }
    }
}
