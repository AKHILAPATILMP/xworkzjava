package com.xworkz.isarelation.guitar;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Guitar");
        Guitar guitar = new Guitar();
        guitar.play();
        guitar.tune();
        guitar.clean();
        guitar.displayType();

        System.out.println("\nCreating an instance of ElectricGuitar using Guitar reference");
        Guitar guitarRef = new ElectricGuitar();
        guitarRef.play();
        guitarRef.tune();
        guitarRef.clean();
        guitarRef.displayType();

        System.out.println("\nCreating an instance of ElectricGuitar using subclass reference");
        ElectricGuitar electricGuitar = new ElectricGuitar();
        electricGuitar.play();
        electricGuitar.tune();
        electricGuitar.clean();
        electricGuitar.displayType();
    }
}
