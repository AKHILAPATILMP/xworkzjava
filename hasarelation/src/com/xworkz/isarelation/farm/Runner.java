package com.xworkz.isarelation.farm;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating Farm instance:");
        Farm farm = new Farm();
        farm.plow();
        farm.sowSeeds();
        farm.irrigate();
        farm.harvest();
        farm.storeProduce();

        System.out.println("\nCreating OrganicFarm instance with Farm reference:");
        Farm ref = new OrganicFarm();
        ref.plow();
        ref.sowSeeds();
        ref.irrigate();
        ref.harvest();
        ref.storeProduce();

        System.out.println("\nCreating OrganicFarm instance with subclass reference:");
        OrganicFarm organic = new OrganicFarm();
        organic.plow();
        organic.sowSeeds();
        organic.irrigate();
        organic.harvest();
        organic.storeProduce();
        organic.compost();

        System.out.println("\nUsing FarmController to handle casting:");
        FarmController controller = new FarmController();
        controller.manage(farm);
        controller.manage(ref);
        controller.manage(organic);
    }
}
