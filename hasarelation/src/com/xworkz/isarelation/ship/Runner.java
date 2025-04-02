package com.xworkz.isarelation.ship;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Ship");
            Ship ship = new Ship();
            ship.sail();
            ship.transportGoods();
            ship.navigate();
            ship.anchor();
            ship.maintainBalance();

            System.out.println("\nCreating an instance of CruiseShip using Ship reference");
            Ship shipRef = new CruiseShip();
            shipRef.sail();
            shipRef.transportGoods();
            shipRef.navigate();
            shipRef.anchor();
            shipRef.maintainBalance();

            System.out.println("\nCreating an instance of CruiseShip using subclass reference");
            CruiseShip cruiseShip = new CruiseShip();
            cruiseShip.sail();
            cruiseShip.transportGoods();
            cruiseShip.navigate();
            cruiseShip.anchor();
            cruiseShip.maintainBalance();
            cruiseShip.luxuryAccommodations();
            cruiseShip.entertainment();
            cruiseShip.diningServices();
            cruiseShip.swimmingPool();
            cruiseShip.guidedTours();
        }
    }

