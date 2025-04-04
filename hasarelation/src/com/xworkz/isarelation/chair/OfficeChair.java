package com.xworkz.isarelation.chair;


public class OfficeChair extends Chair {

    public OfficeChair() {
        super();
        System.out.println("OfficeChair constructor is running - subclass");
    }

    @Override
    public void sit() {
        System.out.println("Sitting comfortably on office chair - subclass");
    }

    @Override
    public void move() {
        System.out.println("Rolling the office chair on wheels - subclass");
    }

    @Override
    public void fold() {
        System.out.println("Office chair cannot be folded - subclass");
    }

    @Override
    public void supportBack() {
        System.out.println("Office chair provides ergonomic back support - subclass");
    }
}
