package com.xworkz.isarelation.ship;

    public class CruiseShip extends Ship {
        public CruiseShip() {
            super();
            System.out.println("CruiseShip constructor is running");
        }

        public void luxuryAccommodations() {
            System.out.println("CruiseShip: Offering luxury accommodations...");
        }

        public void entertainment() {
            System.out.println("CruiseShip: Providing entertainment facilities...");
        }

        public void diningServices() {
            System.out.println("CruiseShip: Offering world-class dining...");
        }

        public void swimmingPool() {
            System.out.println("CruiseShip: Featuring onboard swimming pools...");
        }

        public void guidedTours() {
            System.out.println("CruiseShip: Arranging guided tours at ports...");
        }
    }

