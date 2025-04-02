package com.xworkz.isarelation.fridge;

public class Runner {

        public static void main(String[] args) {
            System.out.println("Creating an instance of Fridge ");
            Fridge fridge = new Fridge();
            fridge.cool();
            fridge.freeze();
            fridge.autoDefrost();
            fridge.powerSaving();
            fridge.storeItems();

            System.out.println("\nCreating an instance of SamsungFridge using parent reference");
            Fridge fridgeRef = new SamsungFridge();
            fridgeRef.cool();
            fridgeRef.freeze();
            fridgeRef.autoDefrost();
            fridgeRef.powerSaving();
            fridgeRef.storeItems();

            System.out.println("\nCreating an instance of SamsungFridge using subclass reference");
            SamsungFridge samsungFridge = new SamsungFridge();
            samsungFridge.cool();
            samsungFridge.freeze();
            samsungFridge.autoDefrost();
            samsungFridge.powerSaving();
            samsungFridge.storeItems();
            samsungFridge.smartCooling();
            samsungFridge.touchControl();
            samsungFridge.waterDispenser();
            samsungFridge.energyEfficiency();
            samsungFridge.iceMaker();
        }
    }


