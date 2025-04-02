package com.xworkz.isarelation.pilot;

    public class CommercialPilot extends Pilot {
        public CommercialPilot() {
            super();
            System.out.println("CommercialPilot constructor is running");
        }

        public void manageCrew() {
            System.out.println("CommercialPilot: Managing flight crew...");
        }

        public void handlePassengerRequests() {
            System.out.println("CommercialPilot: Handling passenger requests...");
        }

        public void operateAutopilot() {
            System.out.println("CommercialPilot: Operating the autopilot system...");
        }

        public void monitorWeather() {
            System.out.println("CommercialPilot: Monitoring weather conditions...");
        }

        public void logFlightData() {
            System.out.println("CommercialPilot: Logging flight data...");
        }
    }

