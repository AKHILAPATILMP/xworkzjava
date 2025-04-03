package com.xworkz.isarelation.bike;

    public class SportsBike extends Bike {
        public SportsBike() {
            super();
            System.out.println("SportsBike constructor is running");
        }

        public void turboBoost() {
            System.out.println("SportsBike is using turbo boost");
        }

        public void aerodynamicMode() {
            System.out.println("SportsBike is in aerodynamic mode");
        }

        public void racingMode() {
            System.out.println("SportsBike is in racing mode");
        }
    }

