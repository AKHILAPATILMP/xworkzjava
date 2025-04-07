package com.xworkz.isarelation.guitar;

public class MusicSystem {

    public void perform(Guitar guitar) {
        guitar.play();
        guitar.tune();
        guitar.changeStrings();
        guitar.carry();
        guitar.clean();

        if (guitar instanceof ElectricGuitar) {
            System.out.println("Casting: Guitar is instance of ElectricGuitar");
            ElectricGuitar electric = (ElectricGuitar) guitar;
            electric.plugInAmp();
        }
    }
}
