package com.xworkz.isarelation.blade;

public class FanBlade extends Blade {

    public FanBlade() {
        super();
        System.out.println("FanBlade constructor is running - subclass");
    }

    @Override
    public void rotate() {
        System.out.println("FanBlade rotating at high speed - subclass");
    }

    @Override
    public void sharpen() {
        System.out.println("FanBlade does not need sharpening - subclass");
    }

    @Override
    public void stop() {
        System.out.println("FanBlade stopping with safety mechanism - subclass");
    }

    @Override
    public void clean() {
        System.out.println("FanBlade being cleaned with soft cloth - subclass");
    }

    @Override
    public void polish() {
        System.out.println("FanBlade is being polished with protective spray - subclass");
    }

    public void balanceBlade() {
        System.out.println("FanBlade balancing operation - only in subclass");
    }
}
