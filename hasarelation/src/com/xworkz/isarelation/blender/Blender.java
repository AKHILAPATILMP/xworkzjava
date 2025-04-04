package com.xworkz.isarelation.blender;

public class Blender {

    public Blender() {
        System.out.println("Blender constructor is running - parent class");
    }

    public void start() {
        System.out.println("Starting the manual blender - parent class");
    }

    public void stop() {
        System.out.println("Stopping the manual blender - parent class");
    }

    public void setSpeed(int speed) {
        System.out.println("Setting speed to " + speed + " - parent class");
    }

    public void mixIngredients() {
        System.out.println("Mixing ingredients manually - parent");
    }
}
