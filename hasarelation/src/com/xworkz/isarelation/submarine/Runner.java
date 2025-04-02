package com.xworkz.isarelation.submarine;

    public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Submarine");
            Submarine submarine = new Submarine();
            submarine.dive();
            submarine.surface();
            submarine.sonarScan();
            submarine.navigate();
            submarine.maintainPressure();

            System.out.println("\nCreating an instance of NuclearSubmarine using Submarine reference");
            Submarine submarineRef = new NuclearSubmarine();
            submarineRef.dive();
            submarineRef.surface();
            submarineRef.sonarScan();
            submarineRef.navigate();
            submarineRef.maintainPressure();

            System.out.println("\nCreating an instance of NuclearSubmarine using subclass reference");
            NuclearSubmarine nuclearSubmarine = new NuclearSubmarine();
            nuclearSubmarine.dive();
            nuclearSubmarine.surface();
            nuclearSubmarine.sonarScan();
            nuclearSubmarine.navigate();
            nuclearSubmarine.maintainPressure();
            nuclearSubmarine.launchMissile();
            nuclearSubmarine.generateNuclearPower();
            nuclearSubmarine.stealthMode();
            nuclearSubmarine.deepDive();
            nuclearSubmarine.emergencySurfacing();
        }
    }

