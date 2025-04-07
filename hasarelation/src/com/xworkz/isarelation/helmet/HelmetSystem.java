package com.xworkz.isarelation.helmet;

public class HelmetSystem {

    public void process(Helmet helmet) {
        helmet.wear();
        helmet.remove();
        helmet.clean();
        helmet.adjustStrap();
        helmet.protectHead();

        if (helmet instanceof SmartHelmet) {
            System.out.println("Casting: Helmet is instance of SmartHelmet");
            SmartHelmet smart = (SmartHelmet) helmet;
            smart.connectToApp();
        }
    }
}
