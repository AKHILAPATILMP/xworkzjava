package com.xworkz.isarelation.chips;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Chips");
            Chips chips = new Chips();
            chips.crunch();
            chips.flavor();
            chips.pack();
            chips.fry();
            chips.store();

            System.out.println("\nCreating an instance of PotatoChips using Chips reference");
            Chips chipsRef = new PotatoChips();
            chipsRef.crunch();
            chipsRef.flavor();
            chipsRef.pack();
            chipsRef.fry();
            chipsRef.store();

            System.out.println("\nCreating an instance of PotatoChips using subclass reference");
            PotatoChips potatoChips = new PotatoChips();
            potatoChips.crunch();
            potatoChips.flavor();
            potatoChips.pack();
            potatoChips.fry();
            potatoChips.store();
            potatoChips.addSalt();
            potatoChips.addSpices();
            potatoChips.makeThinSlices();
            potatoChips.bake();
            potatoChips.crispTexture();
        }
    }

