package com.xworkz.isarelation.pilot;

public class Runner {

        public static void main(String[] args) {
            System.out.println("Creating an instance of Pilot");
            Pilot pilot = new Pilot();
            pilot.flyAircraft();
            pilot.navigate();
            pilot.communicateWithATC();
            pilot.ensureSafety();
            pilot.performEmergencyProcedures();

            System.out.println("\nCreating an instance of CommercialPilot using Pilot reference");
            Pilot pilotRef = new CommercialPilot();
            pilotRef.flyAircraft();
            pilotRef.navigate();
            pilotRef.communicateWithATC();
            pilotRef.ensureSafety();
            pilotRef.performEmergencyProcedures();

            System.out.println("\nCreating an instance of CommercialPilot using subclass reference");
            CommercialPilot commercialPilot = new CommercialPilot();
            commercialPilot.flyAircraft();
            commercialPilot.navigate();
            commercialPilot.communicateWithATC();
            commercialPilot.ensureSafety();
            commercialPilot.performEmergencyProcedures();
            commercialPilot.manageCrew();
            commercialPilot.handlePassengerRequests();
            commercialPilot.operateAutopilot();
            commercialPilot.monitorWeather();
            commercialPilot.logFlightData();
        }
    }

