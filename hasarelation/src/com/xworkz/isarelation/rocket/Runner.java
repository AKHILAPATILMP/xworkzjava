package com.xworkz.isarelation.rocket;

public class Runner {

        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SpaceXRocket using Rocket reference");
            Rocket rocketRef = new SpaceXRocket();
            rocketRef.launch();
            rocketRef.boost();
            rocketRef.enterOrbit();
            rocketRef.deployPayload();
            rocketRef.returnToEarth();

            System.out.println("\nCreating an instance of SpaceXRocket using subclass reference");
            SpaceXRocket spaceXRocket = new SpaceXRocket();
            spaceXRocket.launch();
            spaceXRocket.boost();
            spaceXRocket.enterOrbit();
            spaceXRocket.deployPayload();
            spaceXRocket.returnToEarth();
            spaceXRocket.enableAutopilot();
            spaceXRocket.reusableLanding();
            spaceXRocket.activateStarlink();
            spaceXRocket.monitorTelemetry();
            spaceXRocket.adjustThrust();
        }
    }

