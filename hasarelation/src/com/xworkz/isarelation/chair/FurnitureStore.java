package com.xworkz.isarelation.chair;

class OfficeChair extends Chair {

    public OfficeChair() {
        super();
        System.out.println("OfficeChair constructor is running - subclass");
    }

    @Override
    public void sit() {
        System.out.println("Sitting comfortably on an office chair - subclass");
    }

    @Override
    public void adjustHeight() {
        System.out.println("Adjusting height using hydraulic lever - subclass");
    }

    @Override
    public void checkMaterial() {
        System.out.println("Office chair made of mesh and steel - subclass");
    }

    @Override
    public void moveChair() {
        System.out.println("Rolling office chair with wheels - subclass");
    }

    @Override
    public void cleanChair() {
        System.out.println("Cleaning office chair with wipes - subclass");
    }

    public void rotateChair() {
        System.out.println("Office chair is rotating 360 degrees - subclass only");
    }
}
