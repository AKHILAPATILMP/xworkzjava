package com.xworkz.isarelation.ship;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Ship");
        Ship ship = new Ship();
        ship.sail();
        ship.anchor();
        ship.load();
        ship.unload();

        System.out.println("\nCreating an instance of CargoShip using Ship reference");
        Ship shipRef = new CargoShip();
        shipRef.sail();
        shipRef.anchor();
        shipRef.load();
        shipRef.unload();

        System.out.println("\nCreating an instance of CargoShip using subclass reference");
        CargoShip cargoShip = new CargoShip();
        cargoShip.sail();
        cargoShip.anchor();
        cargoShip.load();
        cargoShip.unload();
    }
}
