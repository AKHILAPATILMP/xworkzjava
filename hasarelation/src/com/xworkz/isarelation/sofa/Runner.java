package com.xworkz.isarelation.sofa;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartSofa using Sofa reference");
            Sofa sofaRef = new SmartSofa();
            sofaRef.sit();
            sofaRef.recline();
            sofaRef.fold();
            sofaRef.move();

            System.out.println("\nCreating an instance of SmartSofa using subclass reference");
            SmartSofa smartSofa = new SmartSofa();
            smartSofa.sit();
            smartSofa.recline();
            smartSofa.fold();
            smartSofa.move();
            smartSofa.massage();
            smartSofa.heatControl();
            smartSofa.voiceControl();
            smartSofa.autoRecline();
        }
    }

