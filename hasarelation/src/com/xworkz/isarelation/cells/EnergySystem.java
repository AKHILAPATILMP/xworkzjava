package com.xworkz.isarelation.cells;

public class EnergySystem {
    public void manage(Cells cell) {
        cell.storeEnergy();
        cell.dischargeEnergy();
        cell.checkVoltage();
        cell.checkCapacity();
        cell.recycle();

        if (cell instanceof BatteryCell) {
            System.out.println("Casting: cell is instance of BatteryCell");
            BatteryCell battery = (BatteryCell) cell;
            battery.chargeCell();
        }
    }
}
