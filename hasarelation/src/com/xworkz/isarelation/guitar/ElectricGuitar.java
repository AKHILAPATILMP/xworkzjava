package com.xworkz.isarelation.guitar;

    public class ElectricGuitar extends Guitar {
        public ElectricGuitar() {
            super();
            System.out.println("ElectricGuitar constructor is running");
        }

        public void connectToAmplifier() {
            System.out.println("Electric Guitar is connected to an amplifier");
        }

        public void enableDistortion() {
            System.out.println("Electric Guitar is using distortion effect");
        }

        public void useWhammyBar() {
            System.out.println("Electric Guitar is using the whammy bar");
        }

        public void activatePickupSelector() {
            System.out.println("Electric Guitar pickup selector is activated");
        }

        public void adjustToneKnob() {
            System.out.println("Electric Guitar tone knob is adjusted");
        }
    }

