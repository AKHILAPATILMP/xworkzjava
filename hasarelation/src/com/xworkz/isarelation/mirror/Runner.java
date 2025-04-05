package com.xworkz.isarelation.mirror;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Mirror");
        Mirror mirror = new Mirror();
        mirror.reflect();
        mirror.clean();
        mirror.hang();
        mirror.displayType();

        System.out.println("\nCreating an instance of SmartMirror using Mirror reference");
        Mirror mirrorRef = new SmartMirror();
        mirrorRef.reflect();
        mirrorRef.clean();
        mirrorRef.hang();
        mirrorRef.displayType();

        System.out.println("\nCreating an instance of SmartMirror using subclass reference");
        SmartMirror smartMirror = new SmartMirror();
        smartMirror.reflect();
        smartMirror.clean();
        smartMirror.hang();
        smartMirror.displayType();
    }
}


