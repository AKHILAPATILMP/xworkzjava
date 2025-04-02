package com.xworkz.isarelation.farm;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Farm");
            Farm farm = new Farm();
            farm.plowField();
            farm.sowSeeds();
            farm.irrigateCrops();
            farm.harvestCrops();
            farm.sellProduce();

            System.out.println("\nCreating an instance of OrganicFarm using Farm reference");
            Farm farmRef = new OrganicFarm();
            farmRef.plowField();
            farmRef.sowSeeds();
            farmRef.irrigateCrops();
            farmRef.harvestCrops();
            farmRef.sellProduce();

            System.out.println("\nCreating an instance of OrganicFarm using subclass reference");
            OrganicFarm organicFarm = new OrganicFarm();
            organicFarm.plowField();
            organicFarm.sowSeeds();
            organicFarm.irrigateCrops();
            organicFarm.harvestCrops();
            organicFarm.sellProduce();
            organicFarm.useNaturalFertilizers();
            organicFarm.avoidPesticides();
            organicFarm.cropRotation();
            organicFarm.rainwaterHarvesting();
            organicFarm.sellOrganicProduce();
        }
    }


