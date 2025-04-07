package com.xworkz.isarelation.cupboard;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Cupboard");
        Cupboard cupboard = new Cupboard();
        cupboard.open();
        cupboard.checkCapacity();
        cupboard.lock();
        cupboard.unlock();
        cupboard.close();

        System.out.println("\nCreating an instance of WoodenCupboard using Cupboard reference");
        Cupboard cupboardRef = new WoodenCupboard();
        cupboardRef.open();
        cupboardRef.checkCapacity();
        cupboardRef.lock();
        cupboardRef.unlock();
        cupboardRef.close();

        System.out.println("\nCreating an instance of WoodenCupboard using subclass reference");
        WoodenCupboard wooden = new WoodenCupboard();
        wooden.open();
        wooden.checkCapacity();
        wooden.lock();
        wooden.unlock();
        wooden.close();
        wooden.polish();

        System.out.println("\nUsing FurnitureStore for casting:");
        FurnitureStore store = new FurnitureStore();
        store.inspect(cupboard);
        store.inspect(cupboardRef);
        store.inspect(wooden);
    }
}
