package com.xworkz.isarelation.vacuumCleaner;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of VacuumCleaner");
        VacuumCleaner cleaner = new VacuumCleaner();
        cleaner.start();
        cleaner.stop();
        cleaner.cleanFloor();
        cleaner.emptyDustBag();

        System.out.println("\nCreating an instance of RobotVacuumCleaner using VacuumCleaner reference");
        VacuumCleaner smartCleaner = new RobotVacuumCleaner();
        smartCleaner.start();
        smartCleaner.stop();
        smartCleaner.cleanFloor();
        smartCleaner.emptyDustBag();

        System.out.println("\nCreating an instance of RobotVacuumCleaner using subclass reference");
        RobotVacuumCleaner robot = new RobotVacuumCleaner();
        robot.start();
        robot.stop();
        robot.cleanFloor();
        robot.emptyDustBag();
    }
}

