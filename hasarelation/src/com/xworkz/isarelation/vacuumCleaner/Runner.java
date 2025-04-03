package com.xworkz.isarelation.vacuumCleaner;

public class Runner {

        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartVacuumCleaner using VacuumCleaner reference");
            VacuumCleaner vacuumRef = new SmartCleaner();
            vacuumRef.turnOn();
            vacuumRef.turnOff();
            vacuumRef.startSuction();
            vacuumRef.stopSuction();
            vacuumRef.emptyDustbin();

            System.out.println("\nCreating an instance of SmartVacuumCleaner using subclass reference");
            SmartCleaner smartVacuum = new SmartCleaner();
            smartVacuum.turnOn();
            smartVacuum.turnOff();
            smartVacuum.startSuction();
            smartVacuum.stopSuction();
            smartVacuum.emptyDustbin();
            smartVacuum.connectToWiFi();
            smartVacuum.controlWithApp();
            smartVacuum.voiceControl();
            smartVacuum.autoCleanMode();
            smartVacuum.returnToDock();
        }
    }

