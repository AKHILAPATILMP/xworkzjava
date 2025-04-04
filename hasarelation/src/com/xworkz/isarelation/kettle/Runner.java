package com.xworkz.isarelation.kettle;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Kettle");
        Kettle kettle = new Kettle();
        kettle.fillWater();
        kettle.heatWater();
        kettle.pourWater();
        kettle.cleanKettle();

        System.out.println("\nCreating an instance of ElectricKettle using Kettle reference");
        Kettle kettleRef = new ElectricKettle();
        kettleRef.fillWater();
        kettleRef.heatWater();
        kettleRef.pourWater();
        kettleRef.cleanKettle();

        System.out.println("\nCreating an instance of ElectricKettle using subclass reference");
        ElectricKettle electricKettle = new ElectricKettle();
        electricKettle.fillWater();
        electricKettle.heatWater();
        electricKettle.pourWater();
        electricKettle.cleanKettle();
    }
}


