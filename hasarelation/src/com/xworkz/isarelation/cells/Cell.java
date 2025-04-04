package com.xworkz.isarelation.cells;


public class Cell {

    public Cell() {
        System.out.println("Cell constructor is running - parent class");
    }

    public void provideEnergy() {
        System.out.println("Cell is providing energy - parent class");
    }

    public void checkCharge() {
        System.out.println("Checking charge in the cell - parent class");
    }

    public void storeEnergy() {
        System.out.println("Cell is storing energy - parent class");
    }

    public void dispose() {
        System.out.println("Disposing of the cell properly - parent class");
    }
}
