package com.xworkz.isarelation.farm;

public class OrganicFarm extends Farm {

    public OrganicFarm() {
        super();
        System.out.println("OrganicFarm constructor is running - subclass");
    }

    @Override
    public void plow() {
        System.out.println("OrganicFarm plowing with oxen - subclass");
    }

    @Override
    public void sowSeeds() {
        System.out.println("OrganicFarm sowing non-GMO seeds - subclass");
    }

    @Override
    public void irrigate() {
        System.out.println("OrganicFarm using drip irrigation - subclass");
    }

    @Override
    public void harvest() {
        System.out.println("OrganicFarm harvesting by hand - subclass");
    }

    @Override
    public void storeProduce() {
        System.out.println("OrganicFarm storing in cool storage units - subclass");
    }

    public void compost() {
        System.out.println("OrganicFarm using natural compost - subclass only");
    }
}
