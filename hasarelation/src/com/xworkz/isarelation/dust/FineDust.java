package com.xworkz.isarelation.dust;
    public class FineDust extends Dust {
        public FineDust() {
            super();
            System.out.println("FineDust constructor is running");
        }

        public void polluteAir() {
            System.out.println("FineDust: Contributing to air pollution...");
        }

        public void affectHealth() {
            System.out.println("FineDust: Affecting respiratory health...");
        }

        public void reduceVisibility() {
            System.out.println("FineDust: Causing hazy conditions...");
        }

        public void carryToxins() {
            System.out.println("FineDust: Carrying toxic substances...");
        }

        public void settleFaster() {
            System.out.println("FineDust: Settling faster due to smaller particles...");
        }
    }

