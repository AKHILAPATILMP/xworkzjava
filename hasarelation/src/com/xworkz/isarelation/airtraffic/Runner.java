package com.xworkz.isarelation.airtraffic;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of AirTraffic");
            AirTraffic airTraffic = new AirTraffic();
            airTraffic.monitorFlights();
            airTraffic.controlTakeoff();
            airTraffic.controlLanding();
            airTraffic.communicateWithPilots();
            airTraffic.manageAirRoutes();

            System.out.println("\nCreating an instance of CommercialAirTraffic using AirTraffic reference");
            AirTraffic airTrafficRef = new CommercialAirTraffic();
            airTrafficRef.monitorFlights();
            airTrafficRef.controlTakeoff();
            airTrafficRef.controlLanding();
            airTrafficRef.communicateWithPilots();
            airTrafficRef.manageAirRoutes();

            System.out.println("\nCreating an instance of CommercialAirTraffic using subclass reference");
            CommercialAirTraffic commercialTraffic = new CommercialAirTraffic();
            commercialTraffic.monitorFlights();
            commercialTraffic.controlTakeoff();
            commercialTraffic.controlLanding();
            commercialTraffic.communicateWithPilots();
            commercialTraffic.manageAirRoutes();
            commercialTraffic.scheduleFlights();
            commercialTraffic.handlePassengerRequests();
            commercialTraffic.manageBaggage();
            commercialTraffic.coordinateWithAirlines();
            commercialTraffic.issueWeatherAlerts();
        }
    }

