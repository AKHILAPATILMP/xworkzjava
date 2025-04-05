package com.xworkz.isarelation.ship;

public class CargoShip extends Ship {

    public CargoShip() {
        super();
        System.out.println("CargoShip constructor is running - subclass");
    }

    @Override
    public void sail() {
        System.out.println("CargoShip is sailing with heavy load - subclass");
    }

    @Override
    public void anchor() {
        System.out.println("CargoShip is anchored with double anchors - subclass");
    }

    @Override
    public void load() {
        System.out.println("CargoShip is loading containers using cranes - subclass");
    }

    @Override
    public void unload() {
        System.out.println("CargoShip is unloading goods to dock - subclass");
    }
}


