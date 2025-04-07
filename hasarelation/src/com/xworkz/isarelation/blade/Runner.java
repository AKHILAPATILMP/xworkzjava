package com.xworkz.isarelation.blade;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Blade");
        Blade blade = new Blade();
        blade.rotate();
        blade.sharpen();
        blade.stop();
        blade.clean();
        blade.polish();

        System.out.println("\nCreating instance of FanBlade using Blade reference");
        Blade bladeRef = new FanBlade();
        bladeRef.rotate();
        bladeRef.sharpen();
        bladeRef.stop();
        bladeRef.clean();
        bladeRef.polish();

        System.out.println("\nCreating instance of FanBlade using subclass reference");
        FanBlade fanBlade = new FanBlade();
        fanBlade.rotate();
        fanBlade.sharpen();
        fanBlade.stop();
        fanBlade.clean();
        fanBlade.polish();
        fanBlade.balanceBlade();

        System.out.println("\nRunning test from BladeMachine");
        BladeMachine machine = new BladeMachine();
        machine.testBlade(blade);
        machine.testBlade(bladeRef);
        machine.testBlade(fanBlade);
    }
}
