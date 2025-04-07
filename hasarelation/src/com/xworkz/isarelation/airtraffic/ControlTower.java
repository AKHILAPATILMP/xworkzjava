package com.xworkz.isarelation.airtraffic;

public class ControlTower {
    public void control(AirTraffic airtraffic){
        airtraffic.ensureclean();
        airtraffic.ensureSafety();
        airtraffic.handleCommunication();
        airtraffic.manageFlightPaths();
        airtraffic.monitorAirspace();

        if(airtraffic instanceof AirTrafficControl){
            System.out.println("casting changes the parent ref type ");
            AirTrafficControl airTrafficControl=(AirTrafficControl) airtraffic;
            airTrafficControl.ensureweight();
        }
    }
}
