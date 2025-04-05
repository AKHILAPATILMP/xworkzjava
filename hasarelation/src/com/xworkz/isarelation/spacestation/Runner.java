package com.xworkz.isarelation.spacestation;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of SpaceStation");
        SpaceStation station = new SpaceStation();
        station.launch();
        station.orbit();
        station.maintainSystems();
        station.communicate();

        System.out.println("\nCreating an instance of ResearchSpaceStation using SpaceStation reference");
        SpaceStation ref = new ResearchSpaceStation();
        ref.launch();
        ref.orbit();
        ref.maintainSystems();
        ref.communicate();

        System.out.println("\nCreating an instance of ResearchSpaceStation using subclass reference");
        ResearchSpaceStation researchStation = new ResearchSpaceStation();
        researchStation.launch();
        researchStation.orbit();
        researchStation.maintainSystems();
        researchStation.communicate();
    }
}
