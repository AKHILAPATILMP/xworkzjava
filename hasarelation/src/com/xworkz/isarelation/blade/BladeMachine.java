package com.xworkz.isarelation.blade;

public class BladeMachine {

    public void testBlade(Blade blade) {
        blade.rotate();
        blade.sharpen();
        blade.stop();
        blade.clean();
        blade.polish();

        if (blade instanceof FanBlade) {
            System.out.println("Casting: blade is instance of FanBlade");
            FanBlade fanBlade = (FanBlade) blade;
            fanBlade.balanceBlade();
        }
    }
}
