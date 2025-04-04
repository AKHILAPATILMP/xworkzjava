package com.xworkz.isarelation.airtraffic;


public class AirTrafficControl extends AirTraffic {

    public AirTrafficControl() {
        super();
        System.out.println("AirTrafficControl constructor is running - subclass");
    }

    @Override
    public void monitorAirspace() {
        System.out.println("Monitoring airspace using radar systems - subclass");
    }

    @Override
    public void manageFlightPaths() {
        System.out.println("Managing flight paths using flight scheduling tools - subclass");
    }

    @Override
    public void handleCommunication() {
        System.out.println("Handling pilot-tower communication - subclass");
    }

    @Override
    public void ensureSafety() {
        System.out.println("Ensuring safety with weather tracking and collision avoidance - subclass");
    }
}



