package com.xworkz.isarelation.cupboard;

public class FurnitureStore {

    public void inspect(Cupboard cupboard) {
        cupboard.open();
        cupboard.checkCapacity();
        cupboard.lock();
        cupboard.unlock();
        cupboard.close();

        if (cupboard instanceof WoodenCupboard) {
            System.out.println("Casting: Cupboard is an instance of WoodenCupboard");
            WoodenCupboard wooden = (WoodenCupboard) cupboard;
            wooden.polish();
        }
    }
}
