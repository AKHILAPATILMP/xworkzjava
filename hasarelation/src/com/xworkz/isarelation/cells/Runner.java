package com.xworkz.isarelation.cells;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Cell");
        Cell cell = new Cell();
        cell.provideEnergy();
        cell.checkCharge();
        cell.storeEnergy();
        cell.dispose();

        System.out.println("\nCreating an instance of BatteryCell using Cell reference");
        Cell cellRef = new BatteryCell();
        cellRef.provideEnergy();
        cellRef.checkCharge();
        cellRef.storeEnergy();
        cellRef.dispose();

        System.out.println("\nCreating an instance of BatteryCell using subclass reference");
        BatteryCell batteryCell = new BatteryCell();
        batteryCell.provideEnergy();
        batteryCell.checkCharge();
        batteryCell.storeEnergy();
        batteryCell.dispose();
    }
}
