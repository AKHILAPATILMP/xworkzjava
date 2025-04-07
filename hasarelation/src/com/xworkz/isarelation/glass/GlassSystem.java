package com.xworkz.isarelation.glass;

public class GlassSystem {
    public void handle(Glass glass) {
        glass.reflectLight();
        glass.transmitLight();
        glass.breakGlass();
        glass.cleanGlass();
        glass.supportFrame();

        if (glass instanceof SmartGlass) {
            System.out.println("Casting: glass is an instance of SmartGlass");
            SmartGlass smart = (SmartGlass) glass;
            smart.adjustTint();
        }
    }
}
