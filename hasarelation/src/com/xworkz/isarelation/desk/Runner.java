package com.xworkz.isarelation.desk;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Desk");
        Desk desk = new Desk();
        desk.supportItems();
        desk.provideSurface();
        desk.storeItems();
        desk.adjustHeight();
        desk.cleanSurface();

        System.out.println("\nCreating an instance of SmartDesk using Desk reference");
        Desk deskRef = new SmartDesk();
        deskRef.supportItems();
        deskRef.provideSurface();
        deskRef.storeItems();
        deskRef.adjustHeight();
        deskRef.cleanSurface();

        System.out.println("\nCreating an instance of SmartDesk using subclass reference");
        SmartDesk smart = new SmartDesk();
        smart.supportItems();
        smart.provideSurface();
        smart.storeItems();
        smart.adjustHeight();
        smart.cleanSurface();
        smart.connectBluetooth();

        System.out.println("\nCasting check via DeskControl");
        DeskControl control = new DeskControl();
        control.operate(desk);
        control.operate(deskRef);
        control.operate(smart);
    }
}
