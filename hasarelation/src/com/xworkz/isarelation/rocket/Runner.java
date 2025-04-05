package com.xworkz.isarelation.rocket;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Rocket");
        Rocket rocket = new Rocket();
        rocket.launch();
        rocket.land();
        rocket.refuel();
        rocket.statusCheck();

        System.out.println("\nCreating an instance of SpaceRocket using Rocket reference");
        Rocket ref = new SpaceRocket();
        ref.launch();
        ref.land();
        ref.refuel();
        ref.statusCheck();

        System.out.println("\nCreating an instance of SpaceRocket using subclass reference");
        SpaceRocket spaceRocket = new SpaceRocket();
        spaceRocket.launch();
        spaceRocket.land();
        spaceRocket.refuel();
        spaceRocket.statusCheck();
    }
}


