package com.xworkz.isarelation.fridge;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Fridge:");
        Fridge fridge = new Fridge();
        fridge.coolItems();
        fridge.freeze();
        fridge.storeFood();
        fridge.defrost();
        fridge.turnOn();

        System.out.println("\nCreating instance of SmartFridge using Fridge reference:");
        Fridge smartRef = new SmartFridge();
        smartRef.coolItems();
        smartRef.freeze();
        smartRef.storeFood();
        smartRef.defrost();
        smartRef.turnOn();

        System.out.println("\nCreating instance of SmartFridge using subclass reference:");
        SmartFridge smartFridge = new SmartFridge();
        smartFridge.coolItems();
        smartFridge.freeze();
        smartFridge.storeFood();
        smartFridge.defrost();
        smartFridge.turnOn();
        smartFridge.connectWifi();

        System.out.println("\nUsing FridgeSystem to operate:");
        FridgeSystem system = new FridgeSystem();
        system.operate(fridge);
        system.operate(smartRef);
        system.operate(smartFridge);
    }
}
