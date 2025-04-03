package com.xworkz.isarelation.truck;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of DumpTruck using Truck reference");
            Truck truckRef = new DumpTruck();
            truckRef.start();
            truckRef.accelerate();
            truckRef.brake();
            truckRef.stop();
            truckRef.loadCargo();

            System.out.println("\nCreating an instance of DumpTruck using subclass reference");
            DumpTruck dumpTruck = new DumpTruck();
            dumpTruck.start();
            dumpTruck.accelerate();
            dumpTruck.brake();
            dumpTruck.stop();
            dumpTruck.loadCargo();
            dumpTruck.dumpLoad();
            dumpTruck.hydraulicLift();
            dumpTruck.heavyDutyMode();
            dumpTruck.reinforcedBody();
        }
    }

