package com.xworkz.isarelation.desk;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Desk");
        Desk desk = new Desk();
        desk.supportWork();
        desk.storeItems();
        desk.adjustHeight();
        desk.displayMaterial();

        System.out.println("\nCreating an instance of OfficeDesk using Desk reference");
        Desk deskRef = new OfficeDesk();
        deskRef.supportWork();
        deskRef.storeItems();
        deskRef.adjustHeight();
        deskRef.displayMaterial();

        System.out.println("\nCreating an instance of OfficeDesk using subclass reference");
        OfficeDesk officeDesk = new OfficeDesk();
        officeDesk.supportWork();
        officeDesk.storeItems();
        officeDesk.adjustHeight();
        officeDesk.displayMaterial();
    }
}


