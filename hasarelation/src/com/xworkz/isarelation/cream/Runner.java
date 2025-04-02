package com.xworkz.isarelation.cream;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Cream");
            Cream cream = new Cream();
            cream.apply();
            cream.moisturize();
            cream.protect();
            cream.fragrance();
            cream.absorb();

            System.out.println("\nCreating an instance of MoisturizingCream using Cream reference");
            Cream creamRef = new MoisturizingCream();
            creamRef.apply();
            creamRef.moisturize();
            creamRef.protect();
            creamRef.fragrance();
            creamRef.absorb();

            System.out.println("\nCreating an instance of MoisturizingCream using subclass reference");
            MoisturizingCream moisturizingCream = new MoisturizingCream();
            moisturizingCream.apply();
            moisturizingCream.moisturize();
            moisturizingCream.protect();
            moisturizingCream.fragrance();
            moisturizingCream.absorb();
            moisturizingCream.hydrateSkin();
            moisturizingCream.repairSkin();
            moisturizingCream.addGlow();
            moisturizingCream.preventDryness();
            moisturizingCream.sootheIrritation();
        }
    }

