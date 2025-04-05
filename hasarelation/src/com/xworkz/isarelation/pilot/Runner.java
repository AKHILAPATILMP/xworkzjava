package com.xworkz.isarelation.pilot;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Pilot");
        Pilot pilot = new Pilot();
        pilot.fly();
        pilot.land();
        pilot.communicate();
        pilot.performCheck();

        System.out.println("\nCreating an instance of CommercialPilot using Pilot reference");
        Pilot pilotRef = new CommercialPilot();
        pilotRef.fly();
        pilotRef.land();
        pilotRef.communicate();
        pilotRef.performCheck();

        System.out.println("\nCreating an instance of CommercialPilot using subclass reference");
        CommercialPilot commercialPilot = new CommercialPilot();
        commercialPilot.fly();
        commercialPilot.land();
        commercialPilot.communicate();
        commercialPilot.performCheck();
    }
}
