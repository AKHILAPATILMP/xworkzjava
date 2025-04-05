package com.xworkz.isarelation.rocket;
public class SpaceRocket extends Rocket {

    public SpaceRocket() {
        super();
        System.out.println("SpaceRocket constructor is running - subclass");
    }

    @Override
    public void launch() {
        System.out.println("SpaceRocket is launching to orbit - subclass");
    }

    @Override
    public void land() {
        System.out.println("SpaceRocket is landing with precision boosters - subclass");
    }

    @Override
    public void refuel() {
        System.out.println("SpaceRocket is using cryogenic fuel - subclass");
    }

    @Override
    public void statusCheck() {
        System.out.println("SpaceRocket diagnostics are complete - subclass");
    }
}


