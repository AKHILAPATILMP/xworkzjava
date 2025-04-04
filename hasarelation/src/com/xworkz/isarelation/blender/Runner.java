package com.xworkz.isarelation.blender;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Blender");
        Blender blender = new Blender();
        blender.start();
        blender.stop();
        blender.setSpeed(3);
        blender.mixIngredients();

        System.out.println("\nCreating an instance of ElectricBlender using Blender reference");
        Blender blenderRef = new ElectricBlender();
        blenderRef.start();
        blenderRef.stop();
        blenderRef.setSpeed(5);
        blenderRef.mixIngredients();

        System.out.println("\nCreating an instance of ElectricBlender using subclass reference");
        ElectricBlender electricBlender = new ElectricBlender();
        electricBlender.start();
        electricBlender.stop();
        electricBlender.setSpeed(7);
        electricBlender.mixIngredients();
        electricBlender.selfClean();
    }
}
