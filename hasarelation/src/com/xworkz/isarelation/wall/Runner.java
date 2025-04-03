package com.xworkz.isarelation.wall;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartWall using Wall reference");
            Wall wallRef = new SmartWall();
            wallRef.build();
            wallRef.paint();
            wallRef.decorate();
            wallRef.support();
            wallRef.demolish();

            System.out.println("\nCreating an instance of SmartWall using subclass reference");
            SmartWall smartWall = new SmartWall();
            smartWall.build();
            smartWall.paint();
            smartWall.decorate();
            smartWall.support();
            smartWall.demolish();
            smartWall.changeColor();
            smartWall.soundproofing();
            smartWall.temperatureControl();
            smartWall.digitalDisplay();
            smartWall.energyAbsorption();
        }
    }

