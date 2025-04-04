package com.xworkz.isarelation.glass;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Glass");
        Glass glass = new Glass();
        glass.fill();
        glass.drink();
        glass.clean();
        glass.displayMaterial();

        System.out.println("\nCreating an instance of SmartGlass using Glass reference");
        Glass glassRef = new SmartGlass();
        glassRef.fill();
        glassRef.drink();
        glassRef.clean();
        glassRef.displayMaterial();

        System.out.println("\nCreating an instance of SmartGlass using subclass reference");
        SmartGlass smartGlass = new SmartGlass();
        smartGlass.fill();
        smartGlass.drink();
        smartGlass.clean();
        smartGlass.displayMaterial();
    }
}


