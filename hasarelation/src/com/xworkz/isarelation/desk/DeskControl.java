package com.xworkz.isarelation.desk;

public class DeskControl {

    public void operate(Desk desk) {
        desk.supportItems();
        desk.provideSurface();
        desk.storeItems();
        desk.adjustHeight();
        desk.cleanSurface();

        if (desk instanceof SmartDesk) {
            System.out.println("Casting: Desk is instance of SmartDesk");
            SmartDesk smartDesk = (SmartDesk) desk;
            smartDesk.connectBluetooth();
        }
    }
}
