package com.xworkz.isarelation.blender;

public class Blender {

    public Blender() {
        System.out.println("Blender constructor is running - parent class");
    }

    public void start() {
        System.out.println("Blender is starting - parent class");
    }

    public void stop() {
        System.out.println("Blender is stopping - parent class");
    }

    public void blend() {
        System.out.println("Blender is blending ingredients - parent class");
    }

    public void clean() {
        System.out.println("Cleaning the blender - parent class");
    }

    public void adjustSpeed() {
        System.out.println("Adjusting speed of blender - parent class");
    }
}
