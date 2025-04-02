package com.xworkz.isarelation.jet;

    public class FighterJet extends Jet {
        public FighterJet() {
            super();
            System.out.println("FighterJet constructor is running");
        }

        public void engageTarget() {
            System.out.println("FighterJet: Engaging enemy target...");
        }

        public void launchMissiles() {
            System.out.println("FighterJet: Launching missiles...");
        }

        public void activateStealthMode() {
            System.out.println("FighterJet: Activating stealth mode...");
        }

        public void performAerobatics() {
            System.out.println("FighterJet: Performing aerobatic maneuvers...");
        }

        public void deployCountermeasures() {
            System.out.println("FighterJet: Deploying countermeasures...");
        }
    }

