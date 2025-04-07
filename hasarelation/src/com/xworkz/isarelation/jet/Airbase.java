package com.xworkz.isarelation.jet;

public class Airbase {
    public void handleJet(Jet jet) {
        jet.fly();
        jet.land();
        jet.refuel();
        jet.checkSystems();
        jet.communicate();

        if (jet instanceof FighterJet) {
            System.out.println("Casting Jet to FighterJet");
            FighterJet fighter = (FighterJet) jet;
            fighter.launchMissile();
        }
    }
}
