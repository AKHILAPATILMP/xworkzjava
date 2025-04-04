package com.xworkz.isarelation.beach;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Beach");
        Beach beach = new Beach();
        beach.enjoySunset();
        beach.swim();
        beach.buildSandCastle();
        beach.collectShells();

        System.out.println("\nCreating an instance of ResortBeach using Beach reference");
        Beach beachRef = new ResortBeach();
        beachRef.enjoySunset();
        beachRef.swim();
        beachRef.buildSandCastle();
        beachRef.collectShells();

        System.out.println("\nCreating an instance of ResortBeach using subclass reference");
        ResortBeach resortBeach = new ResortBeach();
        resortBeach.enjoySunset();
        resortBeach.swim();
        resortBeach.buildSandCastle();
        resortBeach.collectShells();
    }
}
