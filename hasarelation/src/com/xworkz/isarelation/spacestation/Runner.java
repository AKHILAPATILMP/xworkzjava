package com.xworkz.isarelation.spacestation;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of SpaceStation");
            SpaceStation spaceStation = new SpaceStation();
            spaceStation.orbit();
            spaceStation.research();
            spaceStation.communicate();
            spaceStation.generatePower();
            spaceStation.supportCrew();

            System.out.println("\nCreating an instance of ISS using SpaceStation reference");
            SpaceStation spaceStationRef = new ISS();
            spaceStationRef.orbit();
            spaceStationRef.research();
            spaceStationRef.communicate();
            spaceStationRef.generatePower();
            spaceStationRef.supportCrew();

            System.out.println("\nCreating an instance of ISS using subclass reference");
            ISS iss = new ISS();
            iss.orbit();
            iss.research();
            iss.communicate();
            iss.generatePower();
            iss.supportCrew();
            iss.microgravityResearch();
            iss.docking();
            iss.spaceWalk();
            iss.waterRecycling();
            iss.lifeSupport();
        }
    }

