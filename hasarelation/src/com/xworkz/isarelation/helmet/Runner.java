package com.xworkz.isarelation.helmet;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Helmet:");
        Helmet basicHelmet = new Helmet();
        basicHelmet.wear();
        basicHelmet.remove();
        basicHelmet.clean();
        basicHelmet.adjustStrap();
        basicHelmet.protectHead();

        System.out.println("\nCreating instance of SmartHelmet using Helmet reference:");
        Helmet smartRef = new SmartHelmet();
        smartRef.wear();
        smartRef.remove();
        smartRef.clean();
        smartRef.adjustStrap();
        smartRef.protectHead();

        System.out.println("\nCreating instance of SmartHelmet using subclass reference:");
        SmartHelmet smartHelmet = new SmartHelmet();
        smartHelmet.wear();
        smartHelmet.remove();
        smartHelmet.clean();
        smartHelmet.adjustStrap();
        smartHelmet.protectHead();
        smartHelmet.connectToApp();

        System.out.println("\nUsing HelmetSystem to process and cast:");
        HelmetSystem system = new HelmetSystem();
        system.process(basicHelmet);
        system.process(smartRef);
        system.process(smartHelmet);
    }
}
