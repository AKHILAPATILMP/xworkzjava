package com.xworkz.isarelation.fridge;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Fridge");
        Fridge fridge = new Fridge();
        fridge.cool();
        fridge.defrost();
        fridge.storeItems();
        fridge.showTemperature();

        System.out.println("\nCreating an instance of DoubleDoorFridge using Fridge reference");
        Fridge fridgeRef = new DoubleDoorFridge();
        fridgeRef.cool();
        fridgeRef.defrost();
        fridgeRef.storeItems();
        fridgeRef.showTemperature();

        System.out.println("\nCreating an instance of DoubleDoorFridge using subclass reference");
        DoubleDoorFridge doubleDoor = new DoubleDoorFridge();
        doubleDoor.cool();
        doubleDoor.defrost();
        doubleDoor.storeItems();
        doubleDoor.showTemperature();
    }
}
