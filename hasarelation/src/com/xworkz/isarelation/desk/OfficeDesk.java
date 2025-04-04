package com.xworkz.isarelation.desk;

public class OfficeDesk extends Desk {

    public OfficeDesk() {
        super();
        System.out.println("OfficeDesk constructor is running - subclass");
    }

    @Override
    public void supportWork() {
        System.out.println("OfficeDesk provides ergonomic work support - subclass");
    }

    @Override
    public void storeItems() {
        System.out.println("OfficeDesk has drawers for item storage - subclass");
    }

    @Override
    public void adjustHeight() {
        System.out.println("OfficeDesk allows height adjustment - subclass");
    }

    @Override
    public void displayMaterial() {
        System.out.println("OfficeDesk is made of engineered wood - subclass");
    }
}
