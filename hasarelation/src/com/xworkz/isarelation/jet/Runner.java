package com.xworkz.isarelation.jet;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Jet");
            Jet jet = new Jet();
            jet.fly();
            jet.land();
            jet.refuel();
            jet.navigate();
            jet.maintain();

            System.out.println("\nCreating an instance of FighterJet using Jet reference");
            Jet jetRef = new FighterJet();
            jetRef.fly();
            jetRef.land();
            jetRef.refuel();
            jetRef.navigate();
            jetRef.maintain();

            System.out.println("\nCreating an instance of FighterJet using subclass reference");
            FighterJet fighterJet = new FighterJet();
            fighterJet.fly();
            fighterJet.land();
            fighterJet.refuel();
            fighterJet.navigate();
            fighterJet.maintain();
            fighterJet.engageTarget();
            fighterJet.launchMissiles();
            fighterJet.activateStealthMode();
            fighterJet.performAerobatics();
            fighterJet.deployCountermeasures();
        }
    }

