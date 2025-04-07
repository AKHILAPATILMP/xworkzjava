package com.xworkz.isarelation.blender;

public class BlenderMachine {

    public void operate(Blender blender) {
        blender.start();
        blender.blend();
        blender.adjustSpeed();
        blender.clean();
        blender.stop();

        if (blender instanceof JuicerBlender) {
            System.out.println("Casting: blender is instance of JuicerBlender");
            JuicerBlender juicer = (JuicerBlender) blender;
            juicer.separatePulp();
        }
    }
}
