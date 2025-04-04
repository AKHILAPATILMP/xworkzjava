package com.xworkz.isarelation.helmet;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Helmet");
        Helmet helmet = new Helmet();
        helmet.wear();
        helmet.remove();
        helmet.adjustStrap();
        helmet.protectHead();

        System.out.println("\nCreating an instance of SmartHelmet using Helmet reference");
        Helmet helmetRef = new SmartHelmet();
        helmetRef.wear();
        helmetRef.remove();
        helmetRef.adjustStrap();
        helmetRef.protectHead();

        System.out.println("\nCreating an instance of SmartHelmet using subclass reference");
        SmartHelmet smartHelmet = new SmartHelmet();
        smartHelmet.wear();
        smartHelmet.remove();
        smartHelmet.adjustStrap();
        smartHelmet.protectHead();
    }
}

