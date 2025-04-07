package com.xworkz.isarelation.glass;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Glass:");
        Glass glass = new Glass();
        glass.reflectLight();
        glass.transmitLight();
        glass.breakGlass();
        glass.cleanGlass();
        glass.supportFrame();

        System.out.println("\nCreating instance of SmartGlass using Glass reference:");
        Glass glassRef = new SmartGlass();
        glassRef.reflectLight();
        glassRef.transmitLight();
        glassRef.breakGlass();
        glassRef.cleanGlass();
        glassRef.supportFrame();

        System.out.println("\nCreating instance of SmartGlass using subclass reference:");
        SmartGlass smartGlass = new SmartGlass();
        smartGlass.reflectLight();
        smartGlass.transmitLight();
        smartGlass.breakGlass();
        smartGlass.cleanGlass();
        smartGlass.supportFrame();
        smartGlass.adjustTint();

        System.out.println("\nUsing GlassSystem to handle:");
        GlassSystem system = new GlassSystem();
        system.handle(glass);
        system.handle(glassRef);
        system.handle(smartGlass);
    }
}
