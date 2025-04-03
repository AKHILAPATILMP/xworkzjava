package com.xworkz.isarelation.guitar;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of ElectricGuitar using Guitar reference");
            Guitar guitarRef = new ElectricGuitar();
            guitarRef.play();
            guitarRef.tune();
            guitarRef.changeStrings();
            guitarRef.strum();
            guitarRef.adjustVolume();

            System.out.println("\nCreating an instance of ElectricGuitar using subclass reference");
            ElectricGuitar electricGuitar = new ElectricGuitar();
            electricGuitar.play();
            electricGuitar.tune();
            electricGuitar.changeStrings();
            electricGuitar.strum();
            electricGuitar.adjustVolume();
            electricGuitar.connectToAmplifier();
            electricGuitar.enableDistortion();
            electricGuitar.useWhammyBar();
            electricGuitar.activatePickupSelector();
            electricGuitar.adjustToneKnob();
        }
    }

