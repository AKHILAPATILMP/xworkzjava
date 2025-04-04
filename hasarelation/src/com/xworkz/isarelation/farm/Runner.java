package com.xworkz.isarelation.farm;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Farm");
        Farm farm = new Farm();
        farm.ploughLand();
        farm.growCrops();
        farm.irrigate();
        farm.harvest();

        System.out.println("\nCreating an instance of OrganicFarm using Farm reference");
        Farm farmRef = new OrganicFarm();
        farmRef.ploughLand();
        farmRef.growCrops();
        farmRef.irrigate();
        farmRef.harvest();

        System.out.println("\nCreating an instance of OrganicFarm using subclass reference");
        OrganicFarm organicFarm = new OrganicFarm();
        organicFarm.ploughLand();
        organicFarm.growCrops();
        organicFarm.irrigate();
        organicFarm.harvest();
    }
}

