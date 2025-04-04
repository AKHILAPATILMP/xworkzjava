package com.xworkz.isarelation.chair;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Chair");
        Chair chair = new Chair();
        chair.sit();
        chair.move();
        chair.fold();
        chair.supportBack();

        System.out.println("\nCreating an instance of OfficeChair using Chair reference");
        Chair chairRef = new OfficeChair();
        chairRef.sit();
        chairRef.move();
        chairRef.fold();
        chairRef.supportBack();

        System.out.println("\nCreating an instance of OfficeChair using subclass reference");
        OfficeChair officeChair = new OfficeChair();
        officeChair.sit();
        officeChair.move();
        officeChair.fold();
        officeChair.supportBack();
    }
}

