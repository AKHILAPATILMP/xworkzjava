package com.xworkz.isarelation.chair;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Chair");
        Chair chair = new Chair();
        chair.sit();
        chair.adjustHeight();
        chair.checkMaterial();
        chair.moveChair();
        chair.cleanChair();

        System.out.println("\nCreating an instance of OfficeChair using Chair reference");
        Chair chairRef = new OfficeChair();
        chairRef.sit();
        chairRef.adjustHeight();
        chairRef.checkMaterial();
        chairRef.moveChair();
        chairRef.cleanChair();

        System.out.println("\nCreating an instance of OfficeChair using subclass reference");
        OfficeChair office = new OfficeChair();
        office.sit();
        office.adjustHeight();
        office.checkMaterial();
        office.moveChair();
        office.cleanChair();
        office.rotateChair();

        System.out.println("\nCasting and calling from ChairHandler");
        ChairHandler handler = new ChairHandler();
        handler.handle(chair);     // won't rotate
        handler.handle(chairRef);  // will cast and rotate
        handler.handle(office);    // will cast and rotate
    }
}
