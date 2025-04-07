package com.xworkz.isarelation.kettle;

public class Kitchen {
    public void useKettle(Kettle kettle) {
        kettle.boilWater();
        kettle.pourWater();
        kettle.cleanKettle();
        kettle.checkWaterLevel();
        kettle.handleLid();

        if (kettle instanceof ElectricKettle) {
            System.out.println("Casting Kettle to ElectricKettle");
            ElectricKettle eKettle = (ElectricKettle) kettle;
            eKettle.autoShutdown();
        }
    }
}
