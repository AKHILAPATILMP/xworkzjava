package com.xworkz.isarelation.submarine;

    public class NuclearSubmarine extends Submarine {
        public NuclearSubmarine() {
            super();
            System.out.println("NuclearSubmarine constructor is running");
        }

        public void launchMissile() {
            System.out.println("NuclearSubmarine is launching a missile");
        }

        public void generateNuclearPower() {
            System.out.println("NuclearSubmarine is generating power using a nuclear reactor");
        }

        public void stealthMode() {
            System.out.println("NuclearSubmarine is in stealth mode");
        }

        public void deepDive() {
            System.out.println("NuclearSubmarine is diving deeper than regular submarines");
        }

        public void emergencySurfacing() {
            System.out.println("NuclearSubmarine is performing an emergency surfacing maneuver");
        }
    }

