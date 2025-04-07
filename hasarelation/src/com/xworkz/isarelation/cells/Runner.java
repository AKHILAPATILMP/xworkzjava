package com.xworkz.isarelation.cells;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Cells");
        Cells cell = new Cells();
        cell.storeEnergy();
        cell.dischargeEnergy();
        cell.checkVoltage();
        cell.checkCapacity();
        cell.recycle();

        System.out.println("\nCreating an instance of BatteryCell using Cells reference");
        Cells cellRef = new BatteryCell();
        cellRef.storeEnergy();
        cellRef.dischargeEnergy();
        cellRef.checkVoltage();
        cellRef.checkCapacity();
        cellRef.recycle();

        System.out.println("\nCreating an instance of BatteryCell using subclass reference");
        BatteryCell battery = new BatteryCell();
        battery.storeEnergy();
        battery.dischargeEnergy();
        battery.checkVoltage();
        battery.checkCapacity();
        battery.recycle();
        battery.chargeCell();

        System.out.println("\nCasting and executing through EnergySystem");
        EnergySystem system = new EnergySystem();
        system.manage(cell);      // Normal
        system.manage(cellRef);   // Will trigger cast
        system.manage(battery);   // Will trigger cast
    }
}
