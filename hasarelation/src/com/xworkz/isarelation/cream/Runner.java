package com.xworkz.isarelation.cream;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Cream");
        Cream cream = new Cream();
        cream.apply();
        cream.openLid();
        cream.checkExpiry();
        cream.smell();
        cream.closeLid();

        System.out.println("\nCreating instance of FaceCream using Cream reference");
        Cream creamRef = new FaceCream();
        creamRef.apply();
        creamRef.openLid();
        creamRef.checkExpiry();
        creamRef.smell();
        creamRef.closeLid();

        System.out.println("\nCreating instance of FaceCream using subclass reference");
        FaceCream faceCream = new FaceCream();
        faceCream.apply();
        faceCream.openLid();
        faceCream.checkExpiry();
        faceCream.smell();
        faceCream.closeLid();
        faceCream.applySunscreenLayer();

        System.out.println("\nUsing SkinCareCenter:");
        SkinCareCenter center = new SkinCareCenter();
        center.useCream(cream);
        center.useCream(creamRef);
        center.useCream(faceCream);
    }
}
