package com.xworkz.isarelation.jet;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Jet:");
        Jet regularJet = new Jet();
        regularJet.fly();
        regularJet.land();
        regularJet.refuel();
        regularJet.checkSystems();
        regularJet.communicate();

        System.out.println("\nCreating instance of FighterJet using Jet reference:");
        Jet jetRef = new FighterJet();
        jetRef.fly();
        jetRef.land();
        jetRef.refuel();
        jetRef.checkSystems();
        jetRef.communicate();

        System.out.println("\nCreating instance of FighterJet using subclass reference:");
        FighterJet fighterJet = new FighterJet();
        fighterJet.fly();
        fighterJet.land();
        fighterJet.refuel();
        fighterJet.checkSystems();
        fighterJet.communicate();
        fighterJet.launchMissile();

        System.out.println("\nUsing Airbase to handle and cast jets:");
        Airbase airbase = new Airbase();
        airbase.handleJet(regularJet);
        airbase.handleJet(jetRef);
        airbase.handleJet(fighterJet);
    }
}
