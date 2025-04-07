package com.xworkz.isarelation.kettle;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Kettle:");
        Kettle kettle = new Kettle();
        kettle.boilWater();
        kettle.pourWater();
        kettle.cleanKettle();
        kettle.checkWaterLevel();
        kettle.handleLid();

        System.out.println("\nCreating instance of ElectricKettle using Kettle reference:");
        Kettle kettleRef = new ElectricKettle();
        kettleRef.boilWater();
        kettleRef.pourWater();
        kettleRef.cleanKettle();
        kettleRef.checkWaterLevel();
        kettleRef.handleLid();

        System.out.println("\nCreating instance of ElectricKettle using subclass reference:");
        ElectricKettle electricKettle = new ElectricKettle();
        electricKettle.boilWater();
        electricKettle.pourWater();
        electricKettle.cleanKettle();
        electricKettle.checkWaterLevel();
        electricKettle.handleLid();
        electricKettle.autoShutdown();

        System.out.println("\nUsing Kitchen to handle and cast kettles:");
        Kitchen kitchen = new Kitchen();
        kitchen.useKettle(kettle);
        kitchen.useKettle(kettleRef);
        kitchen.useKettle(electricKettle);
    }
}
