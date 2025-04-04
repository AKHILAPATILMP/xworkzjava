package com.xworkz.isarelation.jet;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Jet");
        Jet jet = new Jet();
        jet.startEngine();
        jet.takeOff();
        jet.fly();
        jet.land();

        System.out.println("\nCreating an instance of FighterJet using Jet reference");
        Jet jetRef = new FighterJet();
        jetRef.startEngine();
        jetRef.takeOff();
        jetRef.fly();
        jetRef.land();

        System.out.println("\nCreating an instance of FighterJet using subclass reference");
        FighterJet fighterJet = new FighterJet();
        fighterJet.startEngine();
        fighterJet.takeOff();
        fighterJet.fly();
        fighterJet.land();
    }
}
