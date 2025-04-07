package com.xworkz.isarelation.chair;

public class ChairHandler {

    public void handle(Chair chair) {
        chair.cleanChair();
        chair.sit();
        chair.adjustHeight();
        chair.checkMaterial();
        chair.moveChair();

        if (chair instanceof OfficeChair) {
            System.out.println("Casting: chair is instance of OfficeChair");
            OfficeChair officeChair = (OfficeChair) chair;
            officeChair.rotateChair();
        }
    }
}
