package com.xworkz.isarelation.airtraffic;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of AirTraffic");
        AirTraffic traffic = new AirTraffic();
        traffic.monitorAirspace();
        traffic.manageFlightPaths();
        traffic.handleCommunication();
        traffic.ensureSafety();
        traffic.ensureclean();

        System.out.println("\nCreating an instance of AirTrafficControl using AirTraffic reference");
        AirTraffic traffic1 = new AirTrafficControl();
        traffic1.monitorAirspace();
        traffic1.manageFlightPaths();
        traffic1.handleCommunication();
        traffic1.ensureSafety();
        traffic1.ensureclean();

        System.out.println("\nCreating an instance of AirTrafficControl using subclass reference");
        AirTrafficControl control = new AirTrafficControl();
        control.monitorAirspace();
        control.manageFlightPaths();
        control.handleCommunication();
        control.ensureSafety();
        control.ensureclean();

        System.out.println("\ncasting runner");
        ControlTower controlTower=new ControlTower();
        controlTower.control(control);
        controlTower.control(traffic);
        controlTower.control(traffic1);
    }
}
