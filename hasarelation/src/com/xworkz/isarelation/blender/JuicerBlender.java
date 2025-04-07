package com.xworkz.isarelation.blender;

public class JuicerBlender extends Blender {

    public JuicerBlender() {
        super();
        System.out.println("JuicerBlender constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("JuicerBlender is starting with juicing mode - subclass");
    }

    @Override
    public void stop() {
        System.out.println("JuicerBlender is stopping safely - subclass");
    }

    @Override
    public void blend() {
        System.out.println("JuicerBlender is blending fruits smoothly - subclass");
    }

    @Override
    public void clean() {
        System.out.println("JuicerBlender cleaning with self-cleaning feature - subclass");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("JuicerBlender speed set to juice mode - subclass");
    }

    public void separatePulp() {
        System.out.println("JuicerBlender is separating pulp - only in subclass");
    }
}
