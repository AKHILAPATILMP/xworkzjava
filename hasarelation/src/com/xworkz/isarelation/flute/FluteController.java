package com.xworkz.isarelation.flute;

public class FluteController {
    public void control(Flute flute) {
        flute.play();
        flute.clean();
        flute.tune();
        flute.store();
        flute.transport();

        if (flute instanceof ElectricFlute) {
            System.out.println("Casting: flute is instance of ElectricFlute");
            ElectricFlute electricFlute = (ElectricFlute) flute;
            electricFlute.charge();
        }
    }
}
