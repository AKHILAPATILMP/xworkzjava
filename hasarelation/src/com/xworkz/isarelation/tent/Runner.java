package com.xworkz.isarelation.tent;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Tent");
        Tent tent = new Tent();
        tent.openTent();
        tent.closeTent();
        tent.foldTent();
        tent.setTent();

        System.out.println("\nCreating an instance of CampingTent using Tent reference");
        Tent tentRef = new CampingTent();
        tentRef.openTent();
        tentRef.closeTent();
        tentRef.foldTent();
        tentRef.setTent();

        System.out.println("\nCreating an instance of CampingTent using subclass reference");
        CampingTent campingTent = new CampingTent();
        campingTent.openTent();
        campingTent.closeTent();
        campingTent.foldTent();
        campingTent.setTent();
    }
}

