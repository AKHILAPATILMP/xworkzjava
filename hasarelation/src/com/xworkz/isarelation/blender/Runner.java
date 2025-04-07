package com.xworkz.isarelation.blender;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Blender");
        Blender blender = new Blender();
        blender.start();
        blender.blend();
        blender.adjustSpeed();
        blender.clean();
        blender.stop();

        System.out.println("\nCreating instance of JuicerBlender using Blender reference");
        Blender blenderRef = new JuicerBlender();
        blenderRef.start();
        blenderRef.blend();
        blenderRef.adjustSpeed();
        blenderRef.clean();
        blenderRef.stop();

        System.out.println("\nCreating instance of JuicerBlender using subclass reference");
        JuicerBlender juicer = new JuicerBlender();
        juicer.start();
        juicer.blend();
        juicer.adjustSpeed();
        juicer.clean();
        juicer.stop();
        juicer.separatePulp();

        System.out.println("\nRunning BlenderMachine controller:");
        BlenderMachine machine = new BlenderMachine();
        machine.operate(blender);
        machine.operate(blenderRef);
        machine.operate(juicer);
    }
}
