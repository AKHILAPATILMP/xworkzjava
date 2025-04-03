package com.xworkz.isarelation.rocket;

    public class SpaceXRocket extends Rocket {
        public SpaceXRocket() {
            super();
            System.out.println("SpaceXRocket constructor is running");
        }

        public void enableAutopilot() {
            System.out.println("SpaceX Rocket is on autopilot mode");
        }

        public void reusableLanding() {
            System.out.println("SpaceX Rocket is attempting a reusable landing");
        }

        public void activateStarlink() {
            System.out.println("SpaceX Rocket is deploying Starlink satellites");
        }

        public void monitorTelemetry() {
            System.out.println("SpaceX Rocket is monitoring telemetry data");
        }

        public void adjustThrust() {
            System.out.println("SpaceX Rocket is adjusting thrust levels");
        }
    }

