package com.xworkz.isarelation.farm;

public class OrganicFarm extends Farm {

    public OrganicFarm() {
        super();
        System.out.println("OrganicFarm constructor is running - subclass");
    }

    @Override
    public void ploughLand() {
        System.out.println("OrganicFarm is ploughing using eco-friendly tools - subclass");
    }

    @Override
    public void growCrops() {
        System.out.println("OrganicFarm is growing organic crops - subclass");
    }

    @Override
    public void irrigate() {
        System.out.println("OrganicFarm is irrigated with drip system - subclass");
    }

    @Override
    public void harvest() {
        System.out.println("OrganicFarm crops are harvested manually - subclass");
    }
}



