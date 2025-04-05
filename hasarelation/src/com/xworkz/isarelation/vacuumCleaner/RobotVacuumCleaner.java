package com.xworkz.isarelation.vacuumCleaner;

public class RobotVacuumCleaner extends VacuumCleaner {

    public RobotVacuumCleaner() {
        super();
        System.out.println("RobotVacuumCleaner constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("Robot vacuum starts automatically - subclass");
    }

    @Override
    public void stop() {
        System.out.println("Robot vacuum stops after schedule - subclass");
    }

    @Override
    public void cleanFloor() {
        System.out.println("Robot vacuum is cleaning intelligently - subclass");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("Robot vacuum sends notification to empty dust bin - subclass");
    }
}
