package com.xworkz.isarelation.farm;

public class FarmController {
    public void manage(Farm farm) {
        farm.plow();
        farm.sowSeeds();
        farm.irrigate();
        farm.harvest();
        farm.storeProduce();

        if (farm instanceof OrganicFarm) {
            System.out.println("Casting: Farm is instance of OrganicFarm");
            OrganicFarm organic = (OrganicFarm) farm;
            organic.compost();
        }
    }
}
