package com.xworkz.isarelation.guitar;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Guitar:");
        Guitar acoustic = new Guitar();
        acoustic.play();
        acoustic.tune();
        acoustic.changeStrings();
        acoustic.carry();
        acoustic.clean();

        System.out.println("\nCreating instance of ElectricGuitar using Guitar reference:");
        Guitar guitarRef = new ElectricGuitar();
        guitarRef.play();
        guitarRef.tune();
        guitarRef.changeStrings();
        guitarRef.carry();
        guitarRef.clean();

        System.out.println("\nCreating instance of ElectricGuitar using subclass reference:");
        ElectricGuitar electric = new ElectricGuitar();
        electric.play();
        electric.tune();
        electric.changeStrings();
        electric.carry();
        electric.clean();
        electric.plugInAmp();

        System.out.println("\nUsing MusicSystem for casting check:");
        MusicSystem system = new MusicSystem();
        system.perform(acoustic);
        system.perform(guitarRef);
        system.perform(electric);
    }
}
