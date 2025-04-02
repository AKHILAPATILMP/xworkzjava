package com.xworkz.isarelation.dust;

public class Runner {

        public static void main(String[] args) {
            System.out.println("Creating an instance of Dust");
            Dust dust = new Dust();
            dust.settle();
            dust.spread();
            dust.accumulate();
            dust.causeAllergy();
            dust.absorbMoisture();

            System.out.println("\nCreating an instance of FineDust using Dust reference");
            Dust dustRef = new FineDust();
            dustRef.settle();
            dustRef.spread();
            dustRef.accumulate();
            dustRef.causeAllergy();
            dustRef.absorbMoisture();

            System.out.println("\nCreating an instance of FineDust using subclass reference");
            FineDust fineDust = new FineDust();
            fineDust.settle();
            fineDust.spread();
            fineDust.accumulate();
            fineDust.causeAllergy();
            fineDust.absorbMoisture();
            fineDust.polluteAir();
            fineDust.affectHealth();
            fineDust.reduceVisibility();
            fineDust.carryToxins();
            fineDust.settleFaster();
        }
    }

