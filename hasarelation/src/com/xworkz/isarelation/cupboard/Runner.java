package com.xworkz.isarelation.cupboard;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Cupboard");
        Cupboard cupboard = new Cupboard();
        cupboard.open();
        cupboard.close();
        cupboard.storeItems();
        cupboard.lock();

        System.out.println("\nCreating an instance of WoodenCupboard using Cupboard reference");
        Cupboard cupboardRef = new WoodenCupboard();
        cupboardRef.open();
        cupboardRef.close();
        cupboardRef.storeItems();
        cupboardRef.lock();

        System.out.println("\nCreating an instance of WoodenCupboard using subclass reference");
        WoodenCupboard woodenCupboard = new WoodenCupboard();
        woodenCupboard.open();
        woodenCupboard.close();
        woodenCupboard.storeItems();
        woodenCupboard.lock();
    }
}
