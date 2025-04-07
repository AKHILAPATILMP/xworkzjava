package com.xworkz.isarelation.cream;

public class SkinCareCenter {

    public void useCream(Cream cream) {
        cream.apply();
        cream.openLid();
        cream.checkExpiry();
        cream.smell();
        cream.closeLid();

        if (cream instanceof FaceCream) {
            System.out.println("Casting: Cream is instance of FaceCream");
            FaceCream face = (FaceCream) cream;
            face.applySunscreenLayer();
        }
    }
}
