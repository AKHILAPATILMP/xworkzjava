package com.xworkz.isarelation.truck;

    public class DumpTruck extends Truck {
        public DumpTruck() {
            super();
            System.out.println("DumpTruck constructor is running");
        }

        public void dumpLoad() {
            System.out.println("DumpTruck is unloading materials");
        }

        public void hydraulicLift() {
            System.out.println("DumpTruck is using its hydraulic lift");
        }

        public void heavyDutyMode() {
            System.out.println("DumpTruck is in heavy-duty mode");
        }

        public void reinforcedBody() {
            System.out.println("DumpTruck has a reinforced body for heavy loads");
        }
    }

